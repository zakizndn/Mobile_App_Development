// Generated by view binder compiler. Do not edit!
package com.example.myfoe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myfoe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityProf28Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button Award;

  @NonNull
  public final Button Bio;

  @NonNull
  public final Button Edu;

  @NonNull
  public final Button Expert;

  @NonNull
  public final Button Work;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  private ActivityProf28Binding(@NonNull ConstraintLayout rootView, @NonNull Button Award,
      @NonNull Button Bio, @NonNull Button Edu, @NonNull Button Expert, @NonNull Button Work,
      @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3,
      @NonNull TextView textView4) {
    this.rootView = rootView;
    this.Award = Award;
    this.Bio = Bio;
    this.Edu = Edu;
    this.Expert = Expert;
    this.Work = Work;
    this.imageView = imageView;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.textView4 = textView4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProf28Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProf28Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_prof28, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProf28Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Award;
      Button Award = ViewBindings.findChildViewById(rootView, id);
      if (Award == null) {
        break missingId;
      }

      id = R.id.Bio;
      Button Bio = ViewBindings.findChildViewById(rootView, id);
      if (Bio == null) {
        break missingId;
      }

      id = R.id.Edu;
      Button Edu = ViewBindings.findChildViewById(rootView, id);
      if (Edu == null) {
        break missingId;
      }

      id = R.id.Expert;
      Button Expert = ViewBindings.findChildViewById(rootView, id);
      if (Expert == null) {
        break missingId;
      }

      id = R.id.Work;
      Button Work = ViewBindings.findChildViewById(rootView, id);
      if (Work == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      return new ActivityProf28Binding((ConstraintLayout) rootView, Award, Bio, Edu, Expert, Work,
          imageView, textView2, textView3, textView4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
