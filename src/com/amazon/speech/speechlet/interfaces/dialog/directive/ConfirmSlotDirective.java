package com.amazon.speech.speechlet.interfaces.dialog.directive;

import com.amazon.speech.slu.Intent;
import com.amazon.speech.speechlet.Directive;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This class represents the directive sent to confirm the value of a specific slot before continuing with the dialog.
 */
@JsonTypeName("Dialog.ConfirmSlot")
public class ConfirmSlotDirective extends Directive {
  private String slotToConfirm;
  private Intent updatedIntent;

  public ConfirmSlotDirective(String slotToConfirm) {
    this.slotToConfirm = slotToConfirm;
  }

  private ConfirmSlotDirective() {
  }

  public String getSlotToConfirm() {
    return slotToConfirm;
  }

  public void setSlotToConfirm(String slotToConfirm) {
    this.slotToConfirm = slotToConfirm;
  }

  public Intent getUpdatedIntent() {
    return updatedIntent;
  }

  public void setUpdatedIntent(Intent updatedIntent) {
    this.updatedIntent = updatedIntent;
  }
}
