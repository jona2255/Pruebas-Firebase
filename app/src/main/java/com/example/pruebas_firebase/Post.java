package com.example.pruebas_firebase;

import android.net.Uri;

public class Post {
    public String uid;
    public String author;
    public String authorPhotoUrl;
    public String content;

    // Constructor vacio requerido por Firestore

    public Post(String uid, String author, String authorPhotoUrl, String content) {
        this.uid = uid;
        this.author = author;
        this.authorPhotoUrl = authorPhotoUrl;
        this.content = content;
    }

    public Post(){}
}
