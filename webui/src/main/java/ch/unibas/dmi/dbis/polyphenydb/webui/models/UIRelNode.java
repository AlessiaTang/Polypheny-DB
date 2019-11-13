/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2019 Databases and Information Systems Research Group, University of Basel, Switzerland
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package ch.unibas.dmi.dbis.polyphenydb.webui.models;


import ch.unibas.dmi.dbis.polyphenydb.rel.core.JoinRelType;


/**
 * Model for a RelNode coming from the RelAlg-Builder in the UI
 */
public class UIRelNode {

    /**
     * Type of the RelNode, e.g. TableScan
     */
    public String type;

    /**
     * Children of this node in the tree
     */
    public UIRelNode[] children;

    /**
     * Number of inputs of a node.
     * Required by the RelBuilder
     */
    public int inputCount;

    //tableScan
    public String tableName;

    //join
    public JoinRelType join;
    //join condition
    public String operator;
    public String col1;
    public String col2;

    //filter
    //(String operator)
    public String field;
    public String filter;

    //project
    public String[] fields;

    //aggregate
    public String groupBy;
    public String aggregation;
    public String alias;
    //(String field)

    //sort
    public SortState[] sortColumns;

    //union, minus
    public boolean all;
}