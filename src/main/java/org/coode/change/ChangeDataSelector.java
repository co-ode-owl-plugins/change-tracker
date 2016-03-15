package org.coode.change;

import org.semanticweb.owlapi.model.*;

/**
 * Select the element being added or removed by a change. For ontology ids
 * setting, select the new id.
 */
class ChangeDataSelector implements OWLOntologyChangeVisitorEx<Object> {

    @Override
    public Object visit(AddAxiom change) {
        return change.getAxiom();
    }

    @Override
    public Object visit(RemoveAxiom change) {
        return change.getAxiom();
    }

    @Override
    public Object visit(SetOntologyID change) {
        return change.getNewOntologyID();
    }

    @Override
    public Object visit(AddImport change) {
        return change.getImportDeclaration();
    }

    @Override
    public Object visit(RemoveImport change) {
        return change.getImportDeclaration();
    }

    @Override
    public Object visit(AddOntologyAnnotation change) {
        return change.getAnnotation();
    }

    @Override
    public Object visit(RemoveOntologyAnnotation change) {
        return change.getAnnotation();
    }
}
