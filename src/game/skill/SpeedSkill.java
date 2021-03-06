package game.skill;

import game.Player;

/**
 *  技能:快人一步
 * */
public class SpeedSkill extends BaseSkill{
	
	//public final static int SKILL_ID = SkillInterface.SPEED_SKILL; //快人一步
	
	
	public SpeedSkill(int lv) {
		super(lv);
	}

	public void takeEffect(Player attacker, Player defender) {
		int nAddSpeed = 0;
		switch (getSkillLv()) {
		case 0:
			nAddSpeed = (int)Math.floor( attacker.getAttr().get_total_base_speed() * 0.5 + 3);
			break;

		default:
			break;
		}
		
		attacker.getAttr().add_addi_speed_skill(nAddSpeed); //增加技能速度加成
	}

	@Override
	public int getSkillID() {
		// TODO Auto-generated method stub
		return SkillInterface.SPEED_SKILL;
	}

	@Override
	public int getSkillType() {
		// TODO Auto-generated method stub
		return SKILLTYPE_FOREVER;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "快人一步";
	}

}
