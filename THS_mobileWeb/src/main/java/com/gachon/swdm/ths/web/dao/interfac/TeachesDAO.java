package com.gachon.swdm.ths.web.dao.interfac;

import com.gachon.swdm.ths.web.bean.Teaches;

public interface TeachesDAO {
	public Teaches insertTeaches(Teaches teaches);
	public void deleteTeaches(Teaches teaches);
	public void updateTeaches(Teaches teaches);
}
