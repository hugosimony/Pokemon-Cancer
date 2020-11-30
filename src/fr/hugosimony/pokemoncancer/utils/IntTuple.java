package fr.hugosimony.pokemoncancer.utils;

import java.util.ArrayList;

import fr.hugosimony.pokemoncancer.maps.perso.Pnj;

public class IntTuple {

	public int x;
	public int y;
	
	public IntTuple(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(IntTuple tuple) {
		return this.x == tuple.x && this.y == tuple.y;
	}
	
	public static boolean contains(ArrayList<IntTuple> list, IntTuple tuple) {
		int x = 0;
		boolean contains = false;
		while(!contains && x<list.size()) {
			contains = (list.get(x).x == tuple.x && list.get(x).y == tuple.y);
			x++;
		}
		return contains;
	}
	
	public static boolean containsPnj(ArrayList<Pnj> list, IntTuple tuple) {
		int x = 0;
		boolean contains = false;
		while(!contains && x<list.size()) {
			contains = (list.get(x).positionX == tuple.x && list.get(x).positionY == tuple.y);
			x++;
		}
		return contains;
	}
	
	public static int getPnjIndex(ArrayList<Pnj> list, IntTuple tuple) {
		int x = 0;
		boolean contains = false;
		while(!contains && x<list.size()) {
			contains = (list.get(x).positionX == tuple.x && list.get(x).positionY == tuple.y);
			x++;
		}
		if(contains)
			return x-1;
		return 0;
	}
	
	public static int getPosition(ArrayList<IntTuple> list, IntTuple tuple) {
		int x = 0;
		boolean contains = false;
		while(!contains && x<list.size()) {
			contains = (list.get(x).x == tuple.x && list.get(x).y == tuple.y);
			x++;
		}
		return x;
	}
	
}