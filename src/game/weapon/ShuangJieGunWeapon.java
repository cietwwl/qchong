package game.weapon;

/*
 *  ˫�ع�
 */

import game.Player;
import game.define.WeaponKind;
import game.define.WeaponType;

public class ShuangJieGunWeapon extends BaseWeapon {

	static {
		_weaponKind = WeaponKind.SHUANG_JIE_GUN;	//˫�ع�
		_weaponType = WeaponType.WEAPON_MIDDLE;		//��������
	}
	
	public ShuangJieGunWeapon(int enhanceLv, int minDamage, int maxDamage) {
		super(enhanceLv, minDamage, maxDamage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void HandleEffect(Player attacker, Player defender) {
		// TODO Auto-generated method stub

	}

}
