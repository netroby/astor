package fr.inria.astor.core.loop.navigation;

import java.util.List;

import fr.inria.astor.core.entities.ModificationPoint;
import fr.inria.astor.core.entities.ProgramVariant;
import fr.inria.astor.core.loop.extension.AstorExtensionPoint;

/**
 * 
 * @author Matias Martinez
 *
 */
public interface SuspiciousNavigationStrategy extends AstorExtensionPoint {

	/**
	 * Returns a list with sorted modification points, with the order to be
	 * navigated.
	 * 
	 * @param variant
	 *            variant to be navigated
	 * @return list of modification points sorted by a given strategy
	 */
	List<ModificationPoint> getSortedModificationPointsList(ProgramVariant variant);

}
