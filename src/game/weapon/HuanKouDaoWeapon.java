package game.weapon;

import game.Player;
import game.define.WeaponKind;
import game.define.WeaponType;

public class HuanKouDaoWeapon extends BaseWeapon{

	static{
		_weaponKind = WeaponKind.HUAN_KOU_DAO; 	//���۵�
		_weaponType = WeaponType.WEAPON_MIDDLE;	//��������
	}
	
	
	public HuanKouDaoWeapon(int enhanceLv, int minDamage, int maxDamage) {
		super(enhanceLv, minDamage, maxDamage);
		// TODO Auto-generated constructor stub
		
		
	}

	@Override
	public void HandleEffect(Player attacker, Player defender) {
		// TODO Auto-generated method stub
		
	}

	
}
