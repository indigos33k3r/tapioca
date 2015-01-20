/**
 * Tapioca - Tiny API Providing Inversion of Control Architecture
 * Copyright (C) 2011 by Unbounded Prime, LLC
 * All Rights Reserved
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA
 */
package com.unboundedprime.tapioca.core;

public class ParentTestClass implements ParentTestInterface {

	private ChildTestClass child;

	public ChildTestClass getChild() {
		return child;
	}

	public void setChild(ChildTestClass child) {
		this.child = child;
	}
}