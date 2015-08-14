/**
 * Copyright 2015 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.watson.developer_cloud.relationship_extraction.v1.model;

import com.ibm.watson.developer_cloud.util.GsonSingleton;

/**
 * The Class RelationshipExtractionDataset.
 */
public class RelationshipExtractionDataset {
	/**
	 * Field ENGLISH_NEWS.
	 */
	public static final RelationshipExtractionDataset ENGLISH_NEWS = new RelationshipExtractionDataset("ie-en-news");
	/**
	 * Field SPANISH_NEWS.
	 */
	public static final RelationshipExtractionDataset SPANISH_NEWS = new RelationshipExtractionDataset("ie-es-news");


	/**
	 * Field id.
	 */
	private final String id;

	/**
	 * Instantiates a new dataset.
	 * 
	 * @param id
	 *            the id
	 */
	public RelationshipExtractionDataset(String id) {
		this.id = id;
	}

	/**
	 * Gets the id.
	 * 
	 * 
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	/**
	 * Method toString.
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return getClass().getName() + " "
				+ GsonSingleton.getGson().toJson(this);
	}
}