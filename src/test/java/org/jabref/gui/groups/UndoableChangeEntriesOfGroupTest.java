package org.jabref.gui.groups;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import javax.swing.undo.AbstractUndoableEdit;

import org.jabref.gui.StateManager;
import org.jabref.gui.util.CurrentThreadTaskExecutor;
import org.jabref.model.FieldChange;
import org.jabref.model.database.BibDatabaseContext;
import org.jabref.model.groups.GroupHierarchyType;
import org.jabref.model.groups.GroupTreeNode;
import org.jabref.model.groups.WordKeywordGroup;
import org.junit.Assert;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import javafx.collections.FXCollections;

class UndoableChangeEntriesOfGroupTest {

    private AbstractUndoableEdit esperado;
    private GroupTreeNode node;
    private GroupTreeNodeViewModel nodeviewmodel;
    private List<FieldChange> changes;
    
    @BeforeEach
    public void setUp() throws Exception {
        esperado = null;
        nodeviewmodel= new GroupTreeNodeViewModel(node);

    }
    
    @Test
    public void getUndoableEditTest() throws Exception {
        Assert.assertEquals(esperado, UndoableChangeEntriesOfGroup.getUndoableEdit(nodeviewmodel, changes));
    }
}
