/**
 */
package mM_DSI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mM_DSI.ControlFlow#getName <em>Name</em>}</li>
 *   <li>{@link mM_DSI.ControlFlow#getClause <em>Clause</em>}</li>
 *   <li>{@link mM_DSI.ControlFlow#getMessage <em>Message</em>}</li>
 *   <li>{@link mM_DSI.ControlFlow#getSequenceflow <em>Sequenceflow</em>}</li>
 *   <li>{@link mM_DSI.ControlFlow#getRepCount <em>Rep Count</em>}</li>
 * </ul>
 *
 * @see mM_DSI.MM_DSIPackage#getControlFlow()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SequenceGroupClauseNotEmpty='not self.clause.oclIsUndefined() and self.clause &lt;&gt; \'\''"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SequenceGroupClauseNotEmpty'"
 * @generated
 */
public interface ControlFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mM_DSI.MM_DSIPackage#getControlFlow_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mM_DSI.ControlFlow#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clause</em>' attribute.
	 * @see #setClause(String)
	 * @see mM_DSI.MM_DSIPackage#getControlFlow_Clause()
	 * @model
	 * @generated
	 */
	String getClause();

	/**
	 * Sets the value of the '{@link mM_DSI.ControlFlow#getClause <em>Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clause</em>' attribute.
	 * @see #getClause()
	 * @generated
	 */
	void setClause(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference list.
	 * The list contents are of type {@link mM_DSI.Message}.
	 * It is bidirectional and its opposite is '{@link mM_DSI.Message#getSequencegroup <em>Sequencegroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference list.
	 * @see mM_DSI.MM_DSIPackage#getControlFlow_Message()
	 * @see mM_DSI.Message#getSequencegroup
	 * @model opposite="sequencegroup"
	 * @generated
	 */
	EList<Message> getMessage();

	/**
	 * Returns the value of the '<em><b>Sequenceflow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequenceflow</em>' containment reference.
	 * @see #setSequenceflow(SequenceFlow)
	 * @see mM_DSI.MM_DSIPackage#getControlFlow_Sequenceflow()
	 * @model containment="true"
	 * @generated
	 */
	SequenceFlow getSequenceflow();

	/**
	 * Sets the value of the '{@link mM_DSI.ControlFlow#getSequenceflow <em>Sequenceflow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequenceflow</em>' containment reference.
	 * @see #getSequenceflow()
	 * @generated
	 */
	void setSequenceflow(SequenceFlow value);

	/**
	 * Returns the value of the '<em><b>Rep Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rep Count</em>' attribute.
	 * @see #setRepCount(int)
	 * @see mM_DSI.MM_DSIPackage#getControlFlow_RepCount()
	 * @model
	 * @generated
	 */
	int getRepCount();

	/**
	 * Sets the value of the '{@link mM_DSI.ControlFlow#getRepCount <em>Rep Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rep Count</em>' attribute.
	 * @see #getRepCount()
	 * @generated
	 */
	void setRepCount(int value);

} // ControlFlow
