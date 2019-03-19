package com.develogical;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RecentlyUsedListTest {
	@Test 
	public void generatesEmptyList() {
		assertThat(new RecentlyUsedList().isEmpty(), is(true));
	}

	@Test
	public void addThingsList() {
		RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		recentlyUsedList.addThing("125");
		assertThat(recentlyUsedList.isEmpty(), is(false));
	}

	@Test
	public void retrieveItems(){
		RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		recentlyUsedList.addThing("126");


		assertThat(recentlyUsedList.retrieveItem(0), is("126"));
	}

	@Test
	public void mostRecentFirst(){
		RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		recentlyUsedList.addThing("126");
		recentlyUsedList.addThing("127");


		assertThat(recentlyUsedList.retrieveItem(0), is("127"));
	}

	@Test
	public void canFetchMultipleItems(){
		RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		recentlyUsedList.addThing("126");
		recentlyUsedList.addThing("127");
		recentlyUsedList.addThing("1278");

		assertThat(recentlyUsedList.asList(), is(asList("1278","127", "126")));
	}

	@Test
	public void uniqueOrNot(){
		RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		recentlyUsedList.addThing("126");
		recentlyUsedList.addThing("126");

		assertThat(recentlyUsedList.asList(), is(asList("126")));
	}

	@Test
	public void uniqueOrNot_part2(){
		RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		recentlyUsedList.addThing("126");
		recentlyUsedList.addThing("126");
		recentlyUsedList.addThing("127");
		recentlyUsedList.addThing("126");

		assertThat(recentlyUsedList.asList(), is(asList("127","126")));
	}


}
