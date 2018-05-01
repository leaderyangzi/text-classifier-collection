/*
 * Copyright (C) 2018 kwong
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.chungkwong.classifier.util;
/**
 *
 * @author kwong
 */
public class Counter{
	private int count;
	public Counter(){
	}
	public Counter(int count){
		this.count=count;
	}
	public int getCount(){
		return count;
	}
	public void advance(){
		++count;
	}
	public void advance(int times){
		count+=times;
	}
	@Override
	public boolean equals(Object obj){
		return obj instanceof Counter&&((Counter)obj).count==count;
	}
	@Override
	public int hashCode(){
		int hash=5;
		hash=97*hash+this.count;
		return hash;
	}
	@Override
	public String toString(){
		return Integer.toString(count);
	}
}
