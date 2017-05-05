package com.amazon.speech.speechlet.interfaces.dialog.directive;

import com.amazon.speech.slu.Intent;
import com.amazon.speech.speechlet.Directive;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This class represents the directive sent to confirm the all the information the user has
 * provided for the intent before the skill takes action.
 */
@JsonTypeName("Dialog.ConfirmIntent")
public class ConfirmIntentDirective extends Directive {
  private Intent updatedIntent;

  public Intent getUpdatedIntent() {
    return updatedIntent;
  }

  public void setUpdatedIntent(Intent updatedIntent) {
    this.updatedIntent = updatedIntent;
  }
}
