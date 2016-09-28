package com.example.beans.autowired;

/**
 * All autowired beans could be chosen by:
 * <ul>
 *     <li>By @Autowired, if the bean is unique or it has @Primary annotation</li>
 *     <li>By @Qualifier, where the bean's name could be the classname (with first letter lower) or name defined on annotation </li>
 *     <li>By custom annotations, as you can see at this package.</li>
 * </ul>
 *
 */
public interface Dessert {
    String name();
}
