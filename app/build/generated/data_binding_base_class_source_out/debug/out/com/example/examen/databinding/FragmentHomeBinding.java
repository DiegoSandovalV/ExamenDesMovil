// Generated by view binder compiler. Do not edit!
package com.example.examen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.examen.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RecyclerView RVMovies;

  @NonNull
  public final TextView TVName;

  private FragmentHomeBinding(@NonNull RelativeLayout rootView, @NonNull RecyclerView RVMovies,
      @NonNull TextView TVName) {
    this.rootView = rootView;
    this.RVMovies = RVMovies;
    this.TVName = TVName;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.RVMovies;
      RecyclerView RVMovies = ViewBindings.findChildViewById(rootView, id);
      if (RVMovies == null) {
        break missingId;
      }

      id = R.id.TVName;
      TextView TVName = ViewBindings.findChildViewById(rootView, id);
      if (TVName == null) {
        break missingId;
      }

      return new FragmentHomeBinding((RelativeLayout) rootView, RVMovies, TVName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
