package com.alphexon.tourney;

import org.bukkit.Location;
import org.bukkit.World;

public class CuboidRegion {
	
	private World world;
	
	private Vector3 p1, p2;
	
	public CuboidRegion(World world, Vector3 p1, Vector3 p2) {
		
		this.world = world;

		this.p1 = Vector3.getMinimum(p1, p2);
		this.p2 = Vector3.getMaximum(p1, p2);
		
	}
	
	public CuboidRegion(World world, Location l1, Location l2) {
		
		this.world = world;
		
		Vector3 v1 = new Vector3(l1);
		Vector3 v2 = new Vector3(l2);

		this.p1 = Vector3.getMinimum(v1, v2);
		this.p2 = Vector3.getMaximum(v1, v2);
		
	}
	
	public int getSize() {
		
		int width = p2.x - p1.x;
		int height = p2.y - p2.y;
		int length = p2.z - p2.z;

		return width * height * length;
	}
	
	
	public World getWorld() {
		
		return world;
	}
	
	public Vector3 getMinVector() {
		
		return p1;
	}
	
	public Vector3 getMaxVector() {
		
		return p2;
	}
	
	public Location getMinLocation() {
		
		return new Location(world, p1.getX(), p1.getY(), p1.getZ());
	}
	
	public Location getMaxLocation() {
		
		return new Location(world, p2.getX(), p2.getY(), p2.getZ());
	}
}
