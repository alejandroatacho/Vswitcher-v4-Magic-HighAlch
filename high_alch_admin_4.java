int alchItemId = 9342; //Item ID
ItemComposition itemComp = client.getItemComposition(alchItemId);
if(itemComp != null) {
  v.getCombat().spell(Spell.HIGH_LEVEL_ALCHEMY);
  v.invoke("Cast","<col=00ff00>High Level Alchemy</col><col=ffffff> -> <col=ff9040>"+itemComp.getName()+"</col>",0,58,v.getInventory().slot(alchItemId),9764864,false);
}
else {

v.getGame().logout();
}