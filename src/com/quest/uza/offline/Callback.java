package com.quest.uza.offline;

public interface Callback {
       
   public void doneAtBeginning();
   
   public Object doneInBackground();
   
   public void doneAtEnd(Object result);
   
}
