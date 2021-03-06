package com.bitbakery.plugin.arc.psi;

/*
 * Copyright (c) Kurt Christensen, 2009
 *
 *  Licensed under the Artistic License, Version 2.0 (the "License"); you may not use this
 *  file except in compliance with the License. You may obtain a copy of the License at:
 *
 *  http://www.opensource.org/licenses/artistic-license-2.0.php
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under
 *  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 *  OF ANY KIND, either express or implied. See the License for the specific language
 *  governing permissions and limitations under the License..
 */

import com.bitbakery.plugin.arc.ArcFileType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;

/**
 * Defines all of the various PSI element types for Arc
 */
public interface ArcElementTypes {
    IFileElementType FILE = new IFileElementType(ArcFileType.ARC);
    IElementType DOCSTRING = new ArcElementType("docstring");

    // Specific flavors of expressions 
    IElementType SINGLE_ARG_ANONYMOUS_FUNCTION_DEFINITION = new ArcElementType("single arg fn");
    IElementType ANONYMOUS_FUNCTION_DEFINITION = new ArcElementType("fn");
    IElementType FUNCTION_DEFINITION = new ArcElementType("def");
    IElementType MACRO_DEFINITION = new ArcElementType("mac");

    IElementType IF_BLOCK = new ArcElementType("if");
    IElementType LET_BLOCK = new ArcElementType("let");
    IElementType WITH_BLOCK = new ArcElementType("with");

    IElementType EXPRESSION = new ArcElementType("s expression");
    IElementType VARIABLE_ASSIGNMENT = new ArcElementType("variable assignment");

    TokenSet EXPRESSIONS = TokenSet.create(FUNCTION_DEFINITION, MACRO_DEFINITION, ANONYMOUS_FUNCTION_DEFINITION,
            SINGLE_ARG_ANONYMOUS_FUNCTION_DEFINITION, EXPRESSION, IF_BLOCK, LET_BLOCK, WITH_BLOCK, VARIABLE_ASSIGNMENT);
    TokenSet VARIABLE_ASSIGNMENT_FILTER = TokenSet.create(VARIABLE_ASSIGNMENT);

    IElementType QUOTED_EXPRESSION = new ArcElementType("quoted expression");
    IElementType BACKQUOTED_EXPRESSION = new ArcElementType("backquoted expression");
    IElementType COMMA_EXPRESSION = new ArcElementType("comma expression");
    IElementType COMMA_AT_EXPRESSION = new ArcElementType("comma-at expression");


    // Any atom is either a literal or symbol; symbols are either variable definitions or variable references
    IElementType VARIABLE_DEFINITION = new ArcElementType("variable definition");
    IElementType VARIABLE_REFERENCE = new ArcElementType("variable reference");
    IElementType LITERAL = new ArcElementType("literal");

    TokenSet VARIABLE_DEFINITION_FILTER = TokenSet.create(VARIABLE_DEFINITION);
    TokenSet VARIABLE_REFERENCE_FILTER = TokenSet.create(VARIABLE_REFERENCE);


    // def/mac/fn formal parameters
    IElementType PARAMETER_LIST = new ArcElementType("parameter list");
    IElementType PARAMETER = new ArcElementType("parameter");
    IElementType REST_PARAMETER = new ArcElementType("rest parameter");
    IElementType OPTIONAL_PARAMETER = new ArcElementType("optional parameter");

    TokenSet PARAM_LIST_FILTER = TokenSet.create(PARAMETER_LIST);
    TokenSet PARAM_FILTER = TokenSet.create(PARAMETER);
    TokenSet OPTIONAL_PARAM_FILTER = TokenSet.create(OPTIONAL_PARAMETER);
    TokenSet REST_PARAM_FILTER = TokenSet.create(REST_PARAMETER);
}
