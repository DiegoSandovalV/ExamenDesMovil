// Generated by view binder compiler. Do not edit!
package com.example.examen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.examen.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MovieItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView CVSImage;

  @NonNull
  public final ImageView IVPhoto;

  @NonNull
  public final ConstraintLayout MovieItem;

  @NonNull
  public final TextView TVLanguage;

  @NonNull
  public final TextView TVName;

  @NonNull
  public final TextView TVRating;

  private MovieItemBinding(@NonNull ConstraintLayout rootView, @NonNull CardView CVSImage,
      @NonNull ImageView IVPhoto, @NonNull ConstraintLayout MovieItem, @NonNull TextView TVLanguage,
      @NonNull TextView TVName, @NonNull TextView TVRating) {
    this.rootView = rootView;
    this.CVSImage = CVSImage;
    this.IVPhoto = IVPhoto;
    this.MovieItem = MovieItem;
    this.TVLanguage = TVLanguage;
    this.TVName = TVName;
    this.TVRating = TVRating;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MovieItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MovieItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.movie_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MovieItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.CVSImage;
      CardView CVSImage = ViewBindings.findChildViewById(rootView, id);
      if (CVSImage == null) {
        break missingId;
      }

      id = R.id.IVPhoto;
      ImageView IVPhoto = ViewBindings.findChildViewById(rootView, id);
      if (IVPhoto == null) {
        break missingId;
      }

      ConstraintLayout MovieItem = (ConstraintLayout) rootView;

      id = R.id.TVLanguage;
      TextView TVLanguage = ViewBindings.findChildViewById(rootView, id);
      if (TVLanguage == null) {
        break missingId;
      }

      id = R.id.TVName;
      TextView TVName = ViewBindings.findChildViewById(rootView, id);
      if (TVName == null) {
        break missingId;
      }

      id = R.id.TVRating;
      TextView TVRating = ViewBindings.findChildViewById(rootView, id);
      if (TVRating == null) {
        break missingId;
      }

      return new MovieItemBinding((ConstraintLayout) rootView, CVSImage, IVPhoto, MovieItem,
          TVLanguage, TVName, TVRating);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}