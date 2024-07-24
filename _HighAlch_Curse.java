int ITEM_SLOT = 4;
String ITEM_NAME = "Onyx bolts (e)";
Spell CURSE_SPELL = Spell.CURSE;
String CURSE_NAME = "Curse";
if(!v.getVars().getBoolean("ALCH_INIT")) {
    if(v.getLocalPlayer().hasAnimation(1165)) {
        //CURSE SPELLS ANIMATION (1165)
        v.getVars().setBoolean("ALCH_INIT", true);
        v.getCombat().spell(Spell.HIGH_LEVEL_ALCHEMY);
        v.getCallbacks().afterTicks(1, () -> {
            v.invoke("Cast","<col=00ff00>High Level Alchemy</col><col=ffffff> -> <col=ff9040>"+ITEM_NAME+"</col>",0,58,ITEM_SLOT,9764864,false);
            v.getVars().setBoolean("ALCH_INIT", false);
        });
    } else if(v.getLocalPlayer().hasAnimation(713)) {
        //HIGH ALCH ANIMATION (713)
        if(!client.getSelectedSpellName().contains(CURSE_NAME)) {
            v.getCombat().spell(CURSE_SPELL);
        }
        if(v.getCombat().target() != null) {
            v.getCombat().castTarget();
        }
    } else {
        if(!client.getSelectedSpellName().contains(CURSE_NAME)) {
            v.getCombat().spell(CURSE_SPELL);
        }
       if(v.getCombat().target() != null) {
            v.getCombat().castTarget();
       }
    }
}