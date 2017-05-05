package com.amazon.speech.speechlet.interfaces.dialog.directive;

import com.amazon.speech.slu.Intent;
import com.amazon.speech.speechlet.Directive;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This class represents the directive sent to handle the next turn in the dialog with the user.
 */
@JsonTypeName("Dialog.Delegate")
public class DelegateDirective extends Directive {
  private Intent updatedIntent;

  public Intent getUpdatedIntent() {
    return updatedIntent;
  }

  public void setUpdatedIntent(Intent updatedIntent) {
    this.updatedIntent = updatedIntent;
  }
}
