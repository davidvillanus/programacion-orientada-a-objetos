from flask import url_for
from flask_login import UserMixin
from slugify import slugify
from sqlalchemy.exc import IntegrityError
from werkzeug.security import generate_password_hash, check_password_hash
from app import db


class User(db.Model, UserMixin):

    __tablename__ = 'blog_user'

    id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(80), nullable=False)
    email = db.Column(db.String(256), unique=True, nullable=False)
    password = db.Column(db.String(128), nullable=False)
    nickname = db.Column(db.String(80), unique=True, nullable=False)
    is_admin = db.Column(db.Boolean, default=True)

    def __repr__(self):
        return f'<User {self.email}>'

    def set_password(self, password):
        self.password = generate_password_hash(password)

    def check_password(self, password):
        return check_password_hash(self.password, password)

    def save(self):
        if not self.id:
            db.session.add(self)
        db.session.commit()

    @staticmethod
    def get_by_id(id):
        return User.query.get(id)

    @staticmethod
    def get_by_email(email):
        return User.query.filter_by(email=email).first()

    @staticmethod
    def get_by_nick(nickname):
        return User.query.filter_by(nickname=nickname).first()


class Post(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    user_id = db.Column(db.Integer, db.ForeignKey('blog_user.id', ondelete='CASCADE'), nullable=False)
    title = db.Column(db.String(256), nullable=False)
    title_slug = db.Column(db.String(256), unique=True, nullable=False)
    asignatura = db.Column(db.String(256), nullable=False)
    tema = db.Column(db.String(256), nullable=False)
    autor = db.Column(db.String(256), nullable=False)
    content = db.Column(db.Text)
    url = db.Column(db.String(256))

    def __repr__(self):
        return f'<Post {self.title}>'

    def save(self):
        if not self.id:
            db.session.add(self)
        if not self.title_slug:
            self.title_slug = slugify(self.title)

        saved = False
        count = 0
        while not saved:
            try:
                db.session.commit()
                saved = True
            except IntegrityError:
                count += 1
                self.title_slug = f'{self.title_slug}-{count}'

    def public_url(self):
        return url_for('show_post', slug=self.title_slug, asign=self.asignatura, tema=self.tema, autor=self.autor, url=self.url)

    @staticmethod
    def get_by_slug(slug):
        return Post.query.filter_by(title_slug=slug).first()

    @staticmethod
    def get_by_asign(asign):
        return Post.query.filter_by(asignatura=asign).distinct(Post.autor)

    @staticmethod
    def get_by_autor(autor, asign):
        return Post.query.filter_by(autor=autor).filter_by(asignatura=asign).distinct(Post.tema)

    @staticmethod
    def get_by_tema(autor, asign, tema):
        return Post.query.filter_by(autor=autor).filter_by(asignatura=asign).filter_by(tema=tema).all()

    @staticmethod
    def get_all():
        #return Post.query.all()
        return Post.query.distinct(Post.asignatura)

    @staticmethod
    def get_all_data():
        return Post.query.all()

class Contact(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    nombre = db.Column(db.String(80), nullable=False)
    correo = db.Column(db.String(256), nullable=False)
    asunto = db.Column(db.String(256), nullable=False)
    mensaje = db.Column(db.Text)

    def __repr__(self):
        return f'<Contact {self.nombre}>'

    def save(self):
        if not self.id:
            db.session.add(self)
        db.session.commit()

    @staticmethod
    def get_by_id(id):
        return User.query.get(id)