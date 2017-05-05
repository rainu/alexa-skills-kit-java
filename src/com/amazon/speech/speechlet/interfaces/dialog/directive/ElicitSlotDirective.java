package com.amazon.speech.speechlet.interfaces.dialog.directive;

import com.amazon.speech.slu.Intent;
import com.amazon.speech.speechlet.Directive;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This class represents the directive sent to ask the user for the value of a specific slot.
 */
@JsonTypeName("Dialog.ElicitSlot")
public class ElicitSlotDirective extends Directive {
  private String slotToElicit;
  private Intent updatedIntent;

  public ElicitSlotDirective(String slotToElicit) {
    this.slotToElicit = slotToElicit;
  }

  private ElicitSlotDirective() {
  }

  public String getSlotToElicit() {
    return slotToElicit;
  }

  public void setSlotToElicit(String slotToElicit) {
    this.slotToElicit = slotToElicit;
  }

  public Intent getUpdatedIntent() {
    return updatedIntent;
  }

  public void setUpdatedIntent(Intent updatedIntent) {
    this.updatedIntent = updatedIntent;
  }
}
