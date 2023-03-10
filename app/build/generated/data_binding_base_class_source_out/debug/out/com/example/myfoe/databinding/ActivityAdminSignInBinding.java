// Generated by view binder compiler. Do not edit!
package com.example.myfoe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myfoe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAdminSignInBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText AdminID;

  @NonNull
  public final EditText AdminPassword;

  @NonNull
  public final Button Login1;

  @NonNull
  public final ImageView logo;

  private ActivityAdminSignInBinding(@NonNull ConstraintLayout rootView, @NonNull EditText AdminID,
      @NonNull EditText AdminPassword, @NonNull Button Login1, @NonNull ImageView logo) {
    this.rootView = rootView;
    this.AdminID = AdminID;
    this.AdminPassword = AdminPassword;
    this.Login1 = Login1;
    this.logo = logo;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAdminSignInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAdminSignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_admin_sign_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAdminSignInBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.AdminID;
      EditText AdminID = ViewBindings.findChildViewById(rootView, id);
      if (AdminID == null) {
        break missingId;
      }

      id = R.id.AdminPassword;
      EditText AdminPassword = ViewBindings.findChildViewById(rootView, id);
      if (AdminPassword == null) {
        break missingId;
      }

      id = R.id.Login1;
      Button Login1 = ViewBindings.findChildViewById(rootView, id);
      if (Login1 == null) {
        break missingId;
      }

      id = R.id.logo;
      ImageView logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      return new ActivityAdminSignInBinding((ConstraintLayout) rootView, AdminID, AdminPassword,
          Login1, logo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
