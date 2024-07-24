int alchItemId = 9342;
String alchItemName "Onyx bolts";
if(v.getInventory().amountInInventory(alchItemId, 1, 28)) {
  v.getCombat().spell(Spell.HIGH_LEVEL_ALCHEMY);
  v.invoke("Cast","<col=00ff00>High Level Alchemy</col><col=ffffff> -> <col=ff9040>"+alchItemName +"</col>",0,58,v.getInventory().slot(alchItemIdId),9764864,false);
}