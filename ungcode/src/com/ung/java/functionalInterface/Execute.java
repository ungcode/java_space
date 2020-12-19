package com.ung.java.functionalInterface;
/**
*
*  Copyright 2020 by UNGCODE <ungcode076@gmail.com>
*
* This file is part of UNGCODE open source application.
* 
* UNGCODE open source application is free software: you can redistribute 
* it and/or modify it under the terms of the GNU General Public 
* License as published by the Free Software Foundation, either 
* version 3 of the License, or (at your option) any later version.
* 
* UNGCODE open source application is distributed in the hope that it will 
* be useful, but WITHOUT ANY WARRANTY; without even the implied warranty 
* of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this project.  If not, see <http://www.gnu.org/licenses/>.
*
* @license GPL-3.0+ <http://spdx.org/licenses/GPL-3.0+>
*/
public class Execute {

	public static void main(String[] args) {

		GreetingImpl greeting = new GreetingImpl();
		greeting.perform("Good Morning");
		greeting.greeting().perform("Good Afternoon");
		
		Greeting g = new GreetingImpl();
		g.perform("Good Night");

	}
}
