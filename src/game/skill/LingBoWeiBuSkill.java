package game.skill;

import game.Player;
import game.attri.AttrDodgeContain;

/**
 *  凌波微步
 * @author lpr
 *
 */

public class LingBoWeiBuSkill extends BaseSkill {

	public LingBoWeiBuSkill(int lv) {
		super(lv);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getSkillID() {
		// TODO Auto-generated method stub
		return BaseSkill.LingBoWeiBu_Skill;
	}

	@Override
	public int getSkillType() {
		// TODO Auto-generated method stub
		return SKILLTYPE_FOREVER;
	}
	
	// 技能效果
	public void takeEffect(Player attacker, Player defender){
		int lv = getSkillLv();
		if (0 == lv) {
			//attacker.getAttr().add_addi_dodge(7); //7%的闪避率
			attacker.getAttr()._attr_dodge.addAddiData(AttrDodgeContain.dodgeAddi.dodge_skill.ordinal(), 7);
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "凌波微步";
	}

}
