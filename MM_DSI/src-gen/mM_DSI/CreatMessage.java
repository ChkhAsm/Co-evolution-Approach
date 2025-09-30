/**
 */
package mM_DSI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Creat Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mM_DSI.CreatMessage#isIsCreation <em>Is Creation</em>}</li>
 * </ul>
 *
 * @see mM_DSI.MM_DSIPackage#getCreatMessage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL creatMessageMustHaveNoSource='self.source.oclIsUndefined()'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='creatMessageMustHaveNoSource'"
 * @generated
 */
public interface CreatMessage extends Message {
	/**
	 * Returns the value of the '<em><b>Is Creation</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Creation</em>' attribute.
	 * @see #setIsCreation(boolean)
	 * @see mM_DSI.MM_DSIPackage#getCreatMessage_IsCreation()
	 * @model default="true"
	 * @generated
	 */
	boolean isIsCreation();

	/**
	 * Sets the value of the '{@link mM_DSI.CreatMessage#isIsCreation <em>Is Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Creation</em>' attribute.
	 * @see #isIsCreation()
	 * @generated
	 */
	void setIsCreation(boolean value);

} // CreatMessage
