package com.alphexon.tourney.framework;

import org.bukkit.Location;

public class Vector3 {

	public int x, y, z;
	
	public static final Vector3 ZERO = new Vector3(0, 0, 0);
	
	public Vector3(int x, int y, int z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vector3(Location loc) {
		
		this.x = loc.getBlockX();
		this.y = loc.getBlockY();
		this.z = loc.getBlockZ();
	}
	
	public Vector3 add(Vector3 v) {
		
		this.x += v.x;
		this.y += v.y;
		this.z += v.z;
		
		return this; 
	}
	
	public Vector3 subtract(Vector3 v) {
		
		this.x -= v.x;
		this.y -= v.y;
		this.z -= v.z;
		
		return this; 
	}
	
	public Vector3 multiply(Vector3 v) {
		
		this.x *= v.x;
		this.y *= v.y;
		this.z *= v.z;
		
		return this; 
	}
	
	public int getX() {
		
		return x;
	}
	
	public int getY() {
		
		return y;
	}
	
	public int getZ() {
		
		return z;
	}
	
	public static Vector3 getMinimum(Vector3 v1, Vector3 v2) {
		
		int x = Math.min(v1.x, v2.x);
		int y = Math.min(v1.y, v2.y);
		int z = Math.min(v1.z, v2.z);
		
		return new Vector3(x, y, z);
	}
	
	public static Vector3 getMaximum(Vector3 v1, Vector3 v2) {
		
		int x = Math.max(v1.x, v2.x);
		int y = Math.max(v1.y, v2.y);
		int z = Math.max(v1.z, v2.z);
		
		return new Vector3(x, y, z);
	}
	

}
