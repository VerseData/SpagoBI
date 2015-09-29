/* SpagoBI, the Open Source Business Intelligence suite

 * Copyright (C) 2012 Engineering Ingegneria Informatica S.p.A. - SpagoBI Competency Center
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0, without the "Incompatible With Secondary Licenses" notice. 
 * If a copy of the MPL was not distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package it.eng.spagobi.analiticalmodel.document.metadata;
// Generated 23-apr-2008 15.08.55 by Hibernate Tools 3.1.0 beta3



/**
 * SbiObjectsRatingId generated by hbm2java
 */

public class SbiObjectsRatingId  implements java.io.Serializable {


    // Fields    

     private Integer objId;
     private String userId;


    // Constructors

    /**
     * default constructor.
     */
    public SbiObjectsRatingId() {
    }

    
    /**
     * full constructor.
     * 
     * @param objId the obj id
     * @param userId the user id
     */
    public SbiObjectsRatingId(Integer objId, String userId) {
        this.objId = objId;
        this.userId = userId;
    }
    

   
    // Property accessors

    /**
     * Gets the obj id.
     * 
     * @return the obj id
     */
    public Integer getObjId() {
        return this.objId;
    }
    
    /**
     * Sets the obj id.
     * 
     * @param objId the new obj id
     */
    public void setObjId(Integer objId) {
        this.objId = objId;
    }

    /**
     * Gets the user id.
     * 
     * @return the user id
     */
    public String getUserId() {
        return this.userId;
    }
    
    /**
     * Sets the user id.
     * 
     * @param userId the new user id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
   



   /* (non-Javadoc)
    * @see java.lang.Object#equals(java.lang.Object)
    */
   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SbiObjectsRatingId) ) return false;
		 SbiObjectsRatingId castOther = ( SbiObjectsRatingId ) other; 
         
		 return ( (this.getObjId()==castOther.getObjId()) || ( this.getObjId()!=null && castOther.getObjId()!=null && this.getObjId().equals(castOther.getObjId()) ) )
 && ( (this.getUserId()==castOther.getUserId()) || ( this.getUserId()!=null && castOther.getUserId()!=null && this.getUserId().equals(castOther.getUserId()) ) );
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getObjId() == null ? 0 : this.getObjId().hashCode() );
         result = 37 * result + ( getUserId() == null ? 0 : this.getUserId().hashCode() );
         return result;
   }   





}