package org.jabref.gui.groups;

import org.jabref.model.entry.BibEntry;

import org.jabref.model.entry.event.FieldChangedEvent;
import org.jabref.gui.groups.GroupSidePane;
import org.jabref.gui.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.jabref.gui.BasePanel;
import org.jabref.model.database.BibDatabaseContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;



public class TestesBorto{
	
	GroupMatcher g;
	BibEntry b;
	GroupSidePane groupSidePane;
	JabRefFrame frame;
	SidePaneManager manager;
	boolean bool;
	
	
	@BeforeEach
	private void setUp(){
		g = new GroupMatcher();
		b = new BibEntry();
		groupSidePane = new GroupSidePane(frame, manager);
		frame = new JabRefFrame();
		manager = new SidePaneManager(frame);
		
	}

	@Test
	void matchesTest(){
		boolean answer = g.matches(b);
		assertTrue(answer);
	}

	@Test
	void listenTest(){
		FieldChangedEvent event = new FieldChangedEvent(b, "BortoZikaBoy", "novo valor", "antigo valor"); 
		groupSidePane.listen(event);
		assertTrue(bool);
	}
	
	@Test
	void componentOpeningTest(){ 
		groupSidePane.componentOpening();
		assertTrue(bool);
	}
	
	@Test
	void getRescalingWeightTest(){ 
		int answer = groupSidePane.getRescalingWeight();
		assertEquals(1, answer);
	}
	
	@Test
	void componentClosingTest(){ 
		groupSidePane.componentClosing();
		assertTrue(bool);
	}
	
	@Test
	void setActiveBasePanelTest(){ 
		BibDatabaseContext biDataBaseContext = new BibDatabaseContext();
		BasePanel panel = new BasePanel(frame, biDataBaseContext);
		groupSidePane.setActiveBasePanel(panel);
		assertTrue(bool);
	}
}

