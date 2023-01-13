// Generated by view binder compiler. Do not edit!
package com.example.myfoe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myfoe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLecturersBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button Lec1;

  @NonNull
  public final Button Lec10;

  @NonNull
  public final Button Lec11;

  @NonNull
  public final Button Lec12;

  @NonNull
  public final Button Lec13;

  @NonNull
  public final Button Lec14;

  @NonNull
  public final Button Lec15;

  @NonNull
  public final Button Lec2;

  @NonNull
  public final Button Lec3;

  @NonNull
  public final Button Lec4;

  @NonNull
  public final Button Lec5;

  @NonNull
  public final Button Lec6;

  @NonNull
  public final Button Lec7;

  @NonNull
  public final Button Lec8;

  @NonNull
  public final Button Lec9;

  @NonNull
  public final ImageView logo;

  @NonNull
  public final TextView textView;

  private ActivityLecturersBinding(@NonNull ScrollView rootView, @NonNull Button Lec1,
      @NonNull Button Lec10, @NonNull Button Lec11, @NonNull Button Lec12, @NonNull Button Lec13,
      @NonNull Button Lec14, @NonNull Button Lec15, @NonNull Button Lec2, @NonNull Button Lec3,
      @NonNull Button Lec4, @NonNull Button Lec5, @NonNull Button Lec6, @NonNull Button Lec7,
      @NonNull Button Lec8, @NonNull Button Lec9, @NonNull ImageView logo,
      @NonNull TextView textView) {
    this.rootView = rootView;
    this.Lec1 = Lec1;
    this.Lec10 = Lec10;
    this.Lec11 = Lec11;
    this.Lec12 = Lec12;
    this.Lec13 = Lec13;
    this.Lec14 = Lec14;
    this.Lec15 = Lec15;
    this.Lec2 = Lec2;
    this.Lec3 = Lec3;
    this.Lec4 = Lec4;
    this.Lec5 = Lec5;
    this.Lec6 = Lec6;
    this.Lec7 = Lec7;
    this.Lec8 = Lec8;
    this.Lec9 = Lec9;
    this.logo = logo;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLecturersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLecturersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_lecturers, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLecturersBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Lec1;
      Button Lec1 = ViewBindings.findChildViewById(rootView, id);
      if (Lec1 == null) {
        break missingId;
      }

      id = R.id.Lec10;
      Button Lec10 = ViewBindings.findChildViewById(rootView, id);
      if (Lec10 == null) {
        break missingId;
      }

      id = R.id.Lec11;
      Button Lec11 = ViewBindings.findChildViewById(rootView, id);
      if (Lec11 == null) {
        break missingId;
      }

      id = R.id.Lec12;
      Button Lec12 = ViewBindings.findChildViewById(rootView, id);
      if (Lec12 == null) {
        break missingId;
      }

      id = R.id.Lec13;
      Button Lec13 = ViewBindings.findChildViewById(rootView, id);
      if (Lec13 == null) {
        break missingId;
      }

      id = R.id.Lec14;
      Button Lec14 = ViewBindings.findChildViewById(rootView, id);
      if (Lec14 == null) {
        break missingId;
      }

      id = R.id.Lec15;
      Button Lec15 = ViewBindings.findChildViewById(rootView, id);
      if (Lec15 == null) {
        break missingId;
      }

      id = R.id.Lec2;
      Button Lec2 = ViewBindings.findChildViewById(rootView, id);
      if (Lec2 == null) {
        break missingId;
      }

      id = R.id.Lec3;
      Button Lec3 = ViewBindings.findChildViewById(rootView, id);
      if (Lec3 == null) {
        break missingId;
      }

      id = R.id.Lec4;
      Button Lec4 = ViewBindings.findChildViewById(rootView, id);
      if (Lec4 == null) {
        break missingId;
      }

      id = R.id.Lec5;
      Button Lec5 = ViewBindings.findChildViewById(rootView, id);
      if (Lec5 == null) {
        break missingId;
      }

      id = R.id.Lec6;
      Button Lec6 = ViewBindings.findChildViewById(rootView, id);
      if (Lec6 == null) {
        break missingId;
      }

      id = R.id.Lec7;
      Button Lec7 = ViewBindings.findChildViewById(rootView, id);
      if (Lec7 == null) {
        break missingId;
      }

      id = R.id.Lec8;
      Button Lec8 = ViewBindings.findChildViewById(rootView, id);
      if (Lec8 == null) {
        break missingId;
      }

      id = R.id.Lec9;
      Button Lec9 = ViewBindings.findChildViewById(rootView, id);
      if (Lec9 == null) {
        break missingId;
      }

      id = R.id.logo;
      ImageView logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityLecturersBinding((ScrollView) rootView, Lec1, Lec10, Lec11, Lec12, Lec13,
          Lec14, Lec15, Lec2, Lec3, Lec4, Lec5, Lec6, Lec7, Lec8, Lec9, logo, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
