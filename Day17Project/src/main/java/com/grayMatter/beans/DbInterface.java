package com.grayMatter.beans;

import java.util.List;

public interface DbInterface {
	public List<Regions>  getAll();
	public Regions addRegion();
}
