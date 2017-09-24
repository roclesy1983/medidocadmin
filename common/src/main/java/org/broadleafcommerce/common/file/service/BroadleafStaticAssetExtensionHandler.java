/*
 * #%L
 * BroadleafCommerce CMS Module
 * %%
 * Copyright (C) 2009 - 2014 Broadleaf Commerce
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.broadleafcommerce.common.file.service;

import org.broadleafcommerce.common.extension.ExtensionHandler;
import org.broadleafcommerce.common.extension.ExtensionResultStatusType;
import org.broadleafcommerce.common.site.domain.Site;
import org.springframework.ui.Model;

/**
 * 
 * @author Chris Kittrell (ckittrell)
 */
public interface BroadleafStaticAssetExtensionHandler extends ExtensionHandler {

    public ExtensionResultStatusType removeShareOptionsForMTStandardSite(Model model, Site currentSite);

    /**
     * Provide an extension point to modify the url for a StaticAsset in the case
     * where multiple assets have the same url.
     * @param urlBuilder
     * @return
     */
    public ExtensionResultStatusType modifyDuplicateAssetURL(StringBuilder urlBuilder);

}
