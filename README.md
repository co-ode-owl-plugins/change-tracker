# Change Tracker

## Views description

### Change View
When writing plugins, particularly those that perform refactoring, it is useful to be able to verify the changes that have been applied to the model.

The change view provides a very straightforward list of changesets and the axioms that have been added and removed.

### Diff View
A straightforward view that allows two loaded ontologies to be selected for side-by-side comparison. Each pane displays the axioms that exist in that ontology but not in the other. To use

- make sure the two ontologies you wish to compare are loaded (\*)
- add the diff view to a tab
- from the dropdown at the top of each window select the ontologies you are comparing

(\*) You can load multiple ontologies into the current workspace by selecting `File > Open` and then selecting `Yes` to open the ontology in the same window. Please note that you cannot currently open two ontologies with the same URI into the same workspace.

## Features

- Changesets are grouped together as they are applied in Protégé
- History updates on undo/redo
- Axiom-level comparison of ontologies


## Find the plugins
Find the Changes and Diff Views under the `Window > Views > Miscellaneous views` menu

## Author
Nick Drummond, The University of Manchester

## License
LGPL