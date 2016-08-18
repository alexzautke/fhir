package org.hl7.fhir.convertors;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.

  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:

 * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
 * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.

  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.

 */

// Generated on Mon, Aug 15, 2016 19:58+1000 for FHIR v1.7.0

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionPropertyComponent;
import org.hl7.fhir.dstu2016may.model.StructureDefinition.TypeDerivationRule;
import org.hl7.fhir.dstu3.model.CodeSystem;
import org.hl7.fhir.dstu3.model.ConceptMap;
import org.hl7.fhir.dstu3.model.CodeSystem.FilterOperator;
import org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapGroupComponent;
import org.hl7.fhir.dstu3.model.ConceptMap.SourceElementComponent;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class VersionConvertor_14_20 {

  private static void copyElement(org.hl7.fhir.dstu2016may.model.Element src, org.hl7.fhir.dstu3.model.Element tgt) throws FHIRException {
    tgt.setId(src.getId());
    for (org.hl7.fhir.dstu2016may.model.Extension  e : src.getExtension()) {
      tgt.addExtension(convertExtension(e));
    }
  }

  private static void copyElement(org.hl7.fhir.dstu3.model.Element src, org.hl7.fhir.dstu2016may.model.Element tgt) throws FHIRException {
    tgt.setId(src.getId());
    for (org.hl7.fhir.dstu3.model.Extension  e : src.getExtension()) {
      tgt.addExtension(convertExtension(e));
    }
  }

  private static void copyBackboneElement(org.hl7.fhir.dstu2016may.model.BackboneElement src, org.hl7.fhir.dstu3.model.BackboneElement tgt) throws FHIRException {
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2016may.model.Extension  e : src.getModifierExtension()) {
      tgt.addModifierExtension(convertExtension(e));
    }
  }

  private static void copyBackboneElement(org.hl7.fhir.dstu3.model.BackboneElement src, org.hl7.fhir.dstu2016may.model.BackboneElement tgt) throws FHIRException {
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.Extension  e : src.getModifierExtension()) {
      tgt.addModifierExtension(convertExtension(e));
    }
  }

  public static org.hl7.fhir.dstu3.model.Base64BinaryType convertBase64Binary(org.hl7.fhir.dstu2016may.model.Base64BinaryType src) throws FHIRException {
    org.hl7.fhir.dstu3.model.Base64BinaryType tgt = new org.hl7.fhir.dstu3.model.Base64BinaryType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Base64BinaryType convertBase64Binary(org.hl7.fhir.dstu3.model.Base64BinaryType src) throws FHIRException {
    org.hl7.fhir.dstu2016may.model.Base64BinaryType tgt = new org.hl7.fhir.dstu2016may.model.Base64BinaryType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.BooleanType convertBoolean(org.hl7.fhir.dstu2016may.model.BooleanType src) throws FHIRException {
    org.hl7.fhir.dstu3.model.BooleanType tgt = new org.hl7.fhir.dstu3.model.BooleanType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.BooleanType convertBoolean(org.hl7.fhir.dstu3.model.BooleanType src) throws FHIRException {
    org.hl7.fhir.dstu2016may.model.BooleanType tgt = new org.hl7.fhir.dstu2016may.model.BooleanType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.CodeType convertCode(org.hl7.fhir.dstu2016may.model.CodeType src) throws FHIRException {
    org.hl7.fhir.dstu3.model.CodeType tgt = new org.hl7.fhir.dstu3.model.CodeType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.CodeType convertCode(org.hl7.fhir.dstu3.model.CodeType src) throws FHIRException {
    org.hl7.fhir.dstu2016may.model.CodeType tgt = new org.hl7.fhir.dstu2016may.model.CodeType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.DateType convertDate(org.hl7.fhir.dstu2016may.model.DateType src) throws FHIRException {
    org.hl7.fhir.dstu3.model.DateType tgt = new org.hl7.fhir.dstu3.model.DateType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.DateType convertDate(org.hl7.fhir.dstu3.model.DateType src) throws FHIRException {
    org.hl7.fhir.dstu2016may.model.DateType tgt = new org.hl7.fhir.dstu2016may.model.DateType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.DateTimeType convertDateTime(org.hl7.fhir.dstu2016may.model.DateTimeType src) throws FHIRException {
    org.hl7.fhir.dstu3.model.DateTimeType tgt = new org.hl7.fhir.dstu3.model.DateTimeType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.DateTimeType convertDateTime(org.hl7.fhir.dstu3.model.DateTimeType src) throws FHIRException {
    org.hl7.fhir.dstu2016may.model.DateTimeType tgt = new org.hl7.fhir.dstu2016may.model.DateTimeType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.DecimalType convertDecimal(org.hl7.fhir.dstu2016may.model.DecimalType src) throws FHIRException {
    org.hl7.fhir.dstu3.model.DecimalType tgt = new org.hl7.fhir.dstu3.model.DecimalType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.DecimalType convertDecimal(org.hl7.fhir.dstu3.model.DecimalType src) throws FHIRException {
    org.hl7.fhir.dstu2016may.model.DecimalType tgt = new org.hl7.fhir.dstu2016may.model.DecimalType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.IdType convertId(org.hl7.fhir.dstu2016may.model.IdType src) throws FHIRException {
    org.hl7.fhir.dstu3.model.IdType tgt = new org.hl7.fhir.dstu3.model.IdType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.IdType convertId(org.hl7.fhir.dstu3.model.IdType src) throws FHIRException {
    org.hl7.fhir.dstu2016may.model.IdType tgt = new org.hl7.fhir.dstu2016may.model.IdType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.InstantType convertInstant(org.hl7.fhir.dstu2016may.model.InstantType src) throws FHIRException {
    org.hl7.fhir.dstu3.model.InstantType tgt = new org.hl7.fhir.dstu3.model.InstantType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.InstantType convertInstant(org.hl7.fhir.dstu3.model.InstantType src) throws FHIRException {
    org.hl7.fhir.dstu2016may.model.InstantType tgt = new org.hl7.fhir.dstu2016may.model.InstantType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.IntegerType convertInteger(org.hl7.fhir.dstu2016may.model.IntegerType src) throws FHIRException {
    org.hl7.fhir.dstu3.model.IntegerType tgt = new org.hl7.fhir.dstu3.model.IntegerType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.IntegerType convertInteger(org.hl7.fhir.dstu3.model.IntegerType src) throws FHIRException {
    org.hl7.fhir.dstu2016may.model.IntegerType tgt = new org.hl7.fhir.dstu2016may.model.IntegerType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.MarkdownType convertMarkdown(org.hl7.fhir.dstu2016may.model.MarkdownType src) throws FHIRException {
    org.hl7.fhir.dstu3.model.MarkdownType tgt = new org.hl7.fhir.dstu3.model.MarkdownType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.MarkdownType convertMarkdown(org.hl7.fhir.dstu3.model.MarkdownType src) throws FHIRException {
    org.hl7.fhir.dstu2016may.model.MarkdownType tgt = new org.hl7.fhir.dstu2016may.model.MarkdownType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.OidType convertOid(org.hl7.fhir.dstu2016may.model.OidType src) throws FHIRException {
    org.hl7.fhir.dstu3.model.OidType tgt = new org.hl7.fhir.dstu3.model.OidType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.OidType convertOid(org.hl7.fhir.dstu3.model.OidType src) throws FHIRException {
    org.hl7.fhir.dstu2016may.model.OidType tgt = new org.hl7.fhir.dstu2016may.model.OidType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.PositiveIntType convertPositiveInt(org.hl7.fhir.dstu2016may.model.PositiveIntType src) throws FHIRException {
    org.hl7.fhir.dstu3.model.PositiveIntType tgt = new org.hl7.fhir.dstu3.model.PositiveIntType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.PositiveIntType convertPositiveInt(org.hl7.fhir.dstu3.model.PositiveIntType src) throws FHIRException {
    org.hl7.fhir.dstu2016may.model.PositiveIntType tgt = new org.hl7.fhir.dstu2016may.model.PositiveIntType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.StringType convertString(org.hl7.fhir.dstu2016may.model.StringType src) throws FHIRException {
    org.hl7.fhir.dstu3.model.StringType tgt = new org.hl7.fhir.dstu3.model.StringType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.StringType convertString(org.hl7.fhir.dstu3.model.StringType src) throws FHIRException {
    org.hl7.fhir.dstu2016may.model.StringType tgt = new org.hl7.fhir.dstu2016may.model.StringType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TimeType convertTime(org.hl7.fhir.dstu2016may.model.TimeType src) throws FHIRException {
    org.hl7.fhir.dstu3.model.TimeType tgt = new org.hl7.fhir.dstu3.model.TimeType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.TimeType convertTime(org.hl7.fhir.dstu3.model.TimeType src) throws FHIRException {
    org.hl7.fhir.dstu2016may.model.TimeType tgt = new org.hl7.fhir.dstu2016may.model.TimeType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.UnsignedIntType convertUnsignedInt(org.hl7.fhir.dstu2016may.model.UnsignedIntType src) throws FHIRException {
    org.hl7.fhir.dstu3.model.UnsignedIntType tgt = new org.hl7.fhir.dstu3.model.UnsignedIntType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.UnsignedIntType convertUnsignedInt(org.hl7.fhir.dstu3.model.UnsignedIntType src) throws FHIRException {
    org.hl7.fhir.dstu2016may.model.UnsignedIntType tgt = new org.hl7.fhir.dstu2016may.model.UnsignedIntType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.UriType convertUri(org.hl7.fhir.dstu2016may.model.UriType src) throws FHIRException {
    org.hl7.fhir.dstu3.model.UriType tgt = new org.hl7.fhir.dstu3.model.UriType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.UriType convertUri(org.hl7.fhir.dstu3.model.UriType src) throws FHIRException {
    org.hl7.fhir.dstu2016may.model.UriType tgt = new org.hl7.fhir.dstu2016may.model.UriType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.UuidType convertUuid(org.hl7.fhir.dstu2016may.model.UuidType src) throws FHIRException {
    org.hl7.fhir.dstu3.model.UuidType tgt = new org.hl7.fhir.dstu3.model.UuidType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.UuidType convertUuid(org.hl7.fhir.dstu3.model.UuidType src) throws FHIRException {
    org.hl7.fhir.dstu2016may.model.UuidType tgt = new org.hl7.fhir.dstu2016may.model.UuidType(src.getValue());
    copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Extension convertExtension(org.hl7.fhir.dstu2016may.model.Extension src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Extension tgt = new org.hl7.fhir.dstu3.model.Extension();
    copyElement(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setValue(convertType(src.getValue()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Extension convertExtension(org.hl7.fhir.dstu3.model.Extension src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Extension tgt = new org.hl7.fhir.dstu2016may.model.Extension();
    copyElement(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setValue(convertType(src.getValue()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Narrative convertNarrative(org.hl7.fhir.dstu2016may.model.Narrative src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Narrative tgt = new org.hl7.fhir.dstu3.model.Narrative();
    copyElement(src, tgt);
    tgt.setStatus(convertNarrativeStatus(src.getStatus()));
    tgt.setDiv(src.getDiv());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Narrative convertNarrative(org.hl7.fhir.dstu3.model.Narrative src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Narrative tgt = new org.hl7.fhir.dstu2016may.model.Narrative();
    copyElement(src, tgt);
    tgt.setStatus(convertNarrativeStatus(src.getStatus()));
    tgt.setDiv(src.getDiv());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Narrative.NarrativeStatus convertNarrativeStatus(org.hl7.fhir.dstu2016may.model.Narrative.NarrativeStatus src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case GENERATED: return org.hl7.fhir.dstu3.model.Narrative.NarrativeStatus.GENERATED;
    case EXTENSIONS: return org.hl7.fhir.dstu3.model.Narrative.NarrativeStatus.EXTENSIONS;
    case ADDITIONAL: return org.hl7.fhir.dstu3.model.Narrative.NarrativeStatus.ADDITIONAL;
    case EMPTY: return org.hl7.fhir.dstu3.model.Narrative.NarrativeStatus.EMPTY;
    default: return org.hl7.fhir.dstu3.model.Narrative.NarrativeStatus.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Narrative.NarrativeStatus convertNarrativeStatus(org.hl7.fhir.dstu3.model.Narrative.NarrativeStatus src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case GENERATED: return org.hl7.fhir.dstu2016may.model.Narrative.NarrativeStatus.GENERATED;
    case EXTENSIONS: return org.hl7.fhir.dstu2016may.model.Narrative.NarrativeStatus.EXTENSIONS;
    case ADDITIONAL: return org.hl7.fhir.dstu2016may.model.Narrative.NarrativeStatus.ADDITIONAL;
    case EMPTY: return org.hl7.fhir.dstu2016may.model.Narrative.NarrativeStatus.EMPTY;
    default: return org.hl7.fhir.dstu2016may.model.Narrative.NarrativeStatus.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.Age convertAge(org.hl7.fhir.dstu2016may.model.Age src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Age tgt = new org.hl7.fhir.dstu3.model.Age();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Age convertAge(org.hl7.fhir.dstu3.model.Age src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Age tgt = new org.hl7.fhir.dstu2016may.model.Age();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }


  public static org.hl7.fhir.dstu3.model.Annotation convertAnnotation(org.hl7.fhir.dstu2016may.model.Annotation src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Annotation tgt = new org.hl7.fhir.dstu3.model.Annotation();
    copyElement(src, tgt);
    tgt.setAuthor(convertType(src.getAuthor()));
    tgt.setTime(src.getTime());
    tgt.setText(src.getText());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Annotation convertAnnotation(org.hl7.fhir.dstu3.model.Annotation src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Annotation tgt = new org.hl7.fhir.dstu2016may.model.Annotation();
    copyElement(src, tgt);
    tgt.setAuthor(convertType(src.getAuthor()));
    tgt.setTime(src.getTime());
    tgt.setText(src.getText());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Attachment convertAttachment(org.hl7.fhir.dstu2016may.model.Attachment src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Attachment tgt = new org.hl7.fhir.dstu3.model.Attachment();
    copyElement(src, tgt);
    tgt.setContentType(src.getContentType());
    tgt.setLanguage(src.getLanguage());
    tgt.setData(src.getData());
    tgt.setUrl(src.getUrl());
    tgt.setSize(src.getSize());
    tgt.setHash(src.getHash());
    tgt.setTitle(src.getTitle());
    tgt.setCreation(src.getCreation());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Attachment convertAttachment(org.hl7.fhir.dstu3.model.Attachment src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Attachment tgt = new org.hl7.fhir.dstu2016may.model.Attachment();
    copyElement(src, tgt);
    tgt.setContentType(src.getContentType());
    tgt.setLanguage(src.getLanguage());
    tgt.setData(src.getData());
    tgt.setUrl(src.getUrl());
    tgt.setSize(src.getSize());
    tgt.setHash(src.getHash());
    tgt.setTitle(src.getTitle());
    tgt.setCreation(src.getCreation());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.CodeableConcept convertCodeableConcept(org.hl7.fhir.dstu2016may.model.CodeableConcept src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.CodeableConcept tgt = new org.hl7.fhir.dstu3.model.CodeableConcept();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2016may.model.Coding t : src.getCoding())
      tgt.addCoding(convertCoding(t));
    tgt.setText(src.getText());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.CodeableConcept convertCodeableConcept(org.hl7.fhir.dstu3.model.CodeableConcept src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.CodeableConcept tgt = new org.hl7.fhir.dstu2016may.model.CodeableConcept();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.Coding t : src.getCoding())
      tgt.addCoding(convertCoding(t));
    tgt.setText(src.getText());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Coding convertCoding(org.hl7.fhir.dstu2016may.model.Coding src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Coding tgt = new org.hl7.fhir.dstu3.model.Coding();
    copyElement(src, tgt);
    tgt.setSystem(src.getSystem());
    tgt.setVersion(src.getVersion());
    tgt.setCode(src.getCode());
    tgt.setDisplay(src.getDisplay());
    tgt.setUserSelected(src.getUserSelected());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Coding convertCoding(org.hl7.fhir.dstu3.model.Coding src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Coding tgt = new org.hl7.fhir.dstu2016may.model.Coding();
    copyElement(src, tgt);
    tgt.setSystem(src.getSystem());
    tgt.setVersion(src.getVersion());
    tgt.setCode(src.getCode());
    tgt.setDisplay(src.getDisplay());
    tgt.setUserSelected(src.getUserSelected());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Count convertCount(org.hl7.fhir.dstu2016may.model.Count src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Count tgt = new org.hl7.fhir.dstu3.model.Count();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Count convertCount(org.hl7.fhir.dstu3.model.Count src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Count tgt = new org.hl7.fhir.dstu2016may.model.Count();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Distance convertDistance(org.hl7.fhir.dstu2016may.model.Distance src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Distance tgt = new org.hl7.fhir.dstu3.model.Distance();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Distance convertDistance(org.hl7.fhir.dstu3.model.Distance src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Distance tgt = new org.hl7.fhir.dstu2016may.model.Distance();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Duration convertDuration(org.hl7.fhir.dstu2016may.model.Duration src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Duration tgt = new org.hl7.fhir.dstu3.model.Duration();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Duration convertDuration(org.hl7.fhir.dstu3.model.Duration src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Duration tgt = new org.hl7.fhir.dstu2016may.model.Duration();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Money convertMoney(org.hl7.fhir.dstu2016may.model.Money src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Money tgt = new org.hl7.fhir.dstu3.model.Money();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Money convertMoney(org.hl7.fhir.dstu3.model.Money src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Money tgt = new org.hl7.fhir.dstu2016may.model.Money();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Identifier convertIdentifier(org.hl7.fhir.dstu2016may.model.Identifier src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Identifier tgt = new org.hl7.fhir.dstu3.model.Identifier();
    copyElement(src, tgt);
    tgt.setUse(convertIdentifierUse(src.getUse()));
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setSystem(src.getSystem());
    tgt.setValue(src.getValue());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    tgt.setAssigner(convertReference(src.getAssigner()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Identifier convertIdentifier(org.hl7.fhir.dstu3.model.Identifier src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Identifier tgt = new org.hl7.fhir.dstu2016may.model.Identifier();
    copyElement(src, tgt);
    tgt.setUse(convertIdentifierUse(src.getUse()));
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setSystem(src.getSystem());
    tgt.setValue(src.getValue());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    tgt.setAssigner(convertReference(src.getAssigner()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Identifier.IdentifierUse convertIdentifierUse(org.hl7.fhir.dstu2016may.model.Identifier.IdentifierUse src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case USUAL: return org.hl7.fhir.dstu3.model.Identifier.IdentifierUse.USUAL;
    case OFFICIAL: return org.hl7.fhir.dstu3.model.Identifier.IdentifierUse.OFFICIAL;
    case TEMP: return org.hl7.fhir.dstu3.model.Identifier.IdentifierUse.TEMP;
    case SECONDARY: return org.hl7.fhir.dstu3.model.Identifier.IdentifierUse.SECONDARY;
    default: return org.hl7.fhir.dstu3.model.Identifier.IdentifierUse.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Identifier.IdentifierUse convertIdentifierUse(org.hl7.fhir.dstu3.model.Identifier.IdentifierUse src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case USUAL: return org.hl7.fhir.dstu2016may.model.Identifier.IdentifierUse.USUAL;
    case OFFICIAL: return org.hl7.fhir.dstu2016may.model.Identifier.IdentifierUse.OFFICIAL;
    case TEMP: return org.hl7.fhir.dstu2016may.model.Identifier.IdentifierUse.TEMP;
    case SECONDARY: return org.hl7.fhir.dstu2016may.model.Identifier.IdentifierUse.SECONDARY;
    default: return org.hl7.fhir.dstu2016may.model.Identifier.IdentifierUse.NULL;
    }
  }


  public static org.hl7.fhir.dstu3.model.Period convertPeriod(org.hl7.fhir.dstu2016may.model.Period src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Period tgt = new org.hl7.fhir.dstu3.model.Period();
    copyElement(src, tgt);
    tgt.setStart(src.getStart());
    tgt.setEnd(src.getEnd());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Period convertPeriod(org.hl7.fhir.dstu3.model.Period src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Period tgt = new org.hl7.fhir.dstu2016may.model.Period();
    copyElement(src, tgt);
    tgt.setStart(src.getStart());
    tgt.setEnd(src.getEnd());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Quantity convertQuantity(org.hl7.fhir.dstu2016may.model.Quantity src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Quantity tgt = new org.hl7.fhir.dstu3.model.Quantity();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Quantity convertQuantity(org.hl7.fhir.dstu3.model.Quantity src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Quantity tgt = new org.hl7.fhir.dstu2016may.model.Quantity();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Quantity.QuantityComparator convertQuantityComparator(org.hl7.fhir.dstu2016may.model.Quantity.QuantityComparator src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case LESS_THAN: return org.hl7.fhir.dstu3.model.Quantity.QuantityComparator.LESS_THAN;
    case LESS_OR_EQUAL: return org.hl7.fhir.dstu3.model.Quantity.QuantityComparator.LESS_OR_EQUAL;
    case GREATER_OR_EQUAL: return org.hl7.fhir.dstu3.model.Quantity.QuantityComparator.GREATER_OR_EQUAL;
    case GREATER_THAN: return org.hl7.fhir.dstu3.model.Quantity.QuantityComparator.GREATER_THAN;
    default: return org.hl7.fhir.dstu3.model.Quantity.QuantityComparator.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Quantity.QuantityComparator convertQuantityComparator(org.hl7.fhir.dstu3.model.Quantity.QuantityComparator src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case LESS_THAN: return org.hl7.fhir.dstu2016may.model.Quantity.QuantityComparator.LESS_THAN;
    case LESS_OR_EQUAL: return org.hl7.fhir.dstu2016may.model.Quantity.QuantityComparator.LESS_OR_EQUAL;
    case GREATER_OR_EQUAL: return org.hl7.fhir.dstu2016may.model.Quantity.QuantityComparator.GREATER_OR_EQUAL;
    case GREATER_THAN: return org.hl7.fhir.dstu2016may.model.Quantity.QuantityComparator.GREATER_THAN;
    default: return org.hl7.fhir.dstu2016may.model.Quantity.QuantityComparator.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.Range convertRange(org.hl7.fhir.dstu2016may.model.Range src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Range tgt = new org.hl7.fhir.dstu3.model.Range();
    copyElement(src, tgt);
    tgt.setLow(convertSimpleQuantity(src.getLow()));
    tgt.setHigh(convertSimpleQuantity(src.getHigh()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Range convertRange(org.hl7.fhir.dstu3.model.Range src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Range tgt = new org.hl7.fhir.dstu2016may.model.Range();
    copyElement(src, tgt);
    tgt.setLow(convertSimpleQuantity(src.getLow()));
    tgt.setHigh(convertSimpleQuantity(src.getHigh()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Ratio convertRatio(org.hl7.fhir.dstu2016may.model.Ratio src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Ratio tgt = new org.hl7.fhir.dstu3.model.Ratio();
    copyElement(src, tgt);
    tgt.setNumerator(convertQuantity(src.getNumerator()));
    tgt.setDenominator(convertQuantity(src.getDenominator()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Ratio convertRatio(org.hl7.fhir.dstu3.model.Ratio src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Ratio tgt = new org.hl7.fhir.dstu2016may.model.Ratio();
    copyElement(src, tgt);
    tgt.setNumerator(convertQuantity(src.getNumerator()));
    tgt.setDenominator(convertQuantity(src.getDenominator()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Reference convertReference(org.hl7.fhir.dstu2016may.model.Reference src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Reference tgt = new org.hl7.fhir.dstu3.model.Reference();
    copyElement(src, tgt);
    tgt.setReference(src.getReference());
    tgt.setDisplay(src.getDisplay());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Reference convertReference(org.hl7.fhir.dstu3.model.Reference src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Reference tgt = new org.hl7.fhir.dstu2016may.model.Reference();
    copyElement(src, tgt);
    tgt.setReference(src.getReference());
    tgt.setDisplay(src.getDisplay());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.SampledData convertSampledData(org.hl7.fhir.dstu2016may.model.SampledData src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.SampledData tgt = new org.hl7.fhir.dstu3.model.SampledData();
    copyElement(src, tgt);
    tgt.setOrigin(convertSimpleQuantity(src.getOrigin()));
    tgt.setPeriod(src.getPeriod());
    tgt.setFactor(src.getFactor());
    tgt.setLowerLimit(src.getLowerLimit());
    tgt.setUpperLimit(src.getUpperLimit());
    tgt.setDimensions(src.getDimensions());
    tgt.setData(src.getData());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.SampledData convertSampledData(org.hl7.fhir.dstu3.model.SampledData src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.SampledData tgt = new org.hl7.fhir.dstu2016may.model.SampledData();
    copyElement(src, tgt);
    tgt.setOrigin(convertSimpleQuantity(src.getOrigin()));
    tgt.setPeriod(src.getPeriod());
    tgt.setFactor(src.getFactor());
    tgt.setLowerLimit(src.getLowerLimit());
    tgt.setUpperLimit(src.getUpperLimit());
    tgt.setDimensions(src.getDimensions());
    tgt.setData(src.getData());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Signature convertSignature(org.hl7.fhir.dstu2016may.model.Signature src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Signature tgt = new org.hl7.fhir.dstu3.model.Signature();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2016may.model.Coding t : src.getType())
      tgt.addType(convertCoding(t));
    tgt.setWhen(src.getWhen());
    tgt.setWho(convertType(src.getWho()));
    tgt.setContentType(src.getContentType());
    tgt.setBlob(src.getBlob());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Signature convertSignature(org.hl7.fhir.dstu3.model.Signature src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Signature tgt = new org.hl7.fhir.dstu2016may.model.Signature();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.Coding t : src.getType())
      tgt.addType(convertCoding(t));
    tgt.setWhen(src.getWhen());
    tgt.setWho(convertType(src.getWho()));
    tgt.setContentType(src.getContentType());
    tgt.setBlob(src.getBlob());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Address convertAddress(org.hl7.fhir.dstu2016may.model.Address src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Address tgt = new org.hl7.fhir.dstu3.model.Address();
    copyElement(src, tgt);
    tgt.setUse(convertAddressUse(src.getUse()));
    tgt.setType(convertAddressType(src.getType()));
    tgt.setText(src.getText());
    for (org.hl7.fhir.dstu2016may.model.StringType t : src.getLine())
      tgt.addLine(t.getValue());
    tgt.setCity(src.getCity());
    tgt.setDistrict(src.getDistrict());
    tgt.setState(src.getState());
    tgt.setPostalCode(src.getPostalCode());
    tgt.setCountry(src.getCountry());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Address convertAddress(org.hl7.fhir.dstu3.model.Address src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Address tgt = new org.hl7.fhir.dstu2016may.model.Address();
    copyElement(src, tgt);
    tgt.setUse(convertAddressUse(src.getUse()));
    tgt.setType(convertAddressType(src.getType()));
    tgt.setText(src.getText());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getLine())
      tgt.addLine(t.getValue());
    tgt.setCity(src.getCity());
    tgt.setDistrict(src.getDistrict());
    tgt.setState(src.getState());
    tgt.setPostalCode(src.getPostalCode());
    tgt.setCountry(src.getCountry());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Address.AddressUse convertAddressUse(org.hl7.fhir.dstu2016may.model.Address.AddressUse src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case HOME: return org.hl7.fhir.dstu3.model.Address.AddressUse.HOME;
    case WORK: return org.hl7.fhir.dstu3.model.Address.AddressUse.WORK;
    case TEMP: return org.hl7.fhir.dstu3.model.Address.AddressUse.TEMP;
    case OLD: return org.hl7.fhir.dstu3.model.Address.AddressUse.OLD;
    default: return org.hl7.fhir.dstu3.model.Address.AddressUse.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Address.AddressUse convertAddressUse(org.hl7.fhir.dstu3.model.Address.AddressUse src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case HOME: return org.hl7.fhir.dstu2016may.model.Address.AddressUse.HOME;
    case WORK: return org.hl7.fhir.dstu2016may.model.Address.AddressUse.WORK;
    case TEMP: return org.hl7.fhir.dstu2016may.model.Address.AddressUse.TEMP;
    case OLD: return org.hl7.fhir.dstu2016may.model.Address.AddressUse.OLD;
    default: return org.hl7.fhir.dstu2016may.model.Address.AddressUse.NULL;
    }
  }

  private static org.hl7.fhir.dstu3.model.Address.AddressType convertAddressType(org.hl7.fhir.dstu2016may.model.Address.AddressType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case POSTAL: return org.hl7.fhir.dstu3.model.Address.AddressType.POSTAL;
    case PHYSICAL: return org.hl7.fhir.dstu3.model.Address.AddressType.PHYSICAL;
    case BOTH: return org.hl7.fhir.dstu3.model.Address.AddressType.BOTH;
    default: return org.hl7.fhir.dstu3.model.Address.AddressType.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Address.AddressType convertAddressType(org.hl7.fhir.dstu3.model.Address.AddressType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case POSTAL: return org.hl7.fhir.dstu2016may.model.Address.AddressType.POSTAL;
    case PHYSICAL: return org.hl7.fhir.dstu2016may.model.Address.AddressType.PHYSICAL;
    case BOTH: return org.hl7.fhir.dstu2016may.model.Address.AddressType.BOTH;
    default: return org.hl7.fhir.dstu2016may.model.Address.AddressType.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.ContactPoint convertContactPoint(org.hl7.fhir.dstu2016may.model.ContactPoint src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ContactPoint tgt = new org.hl7.fhir.dstu3.model.ContactPoint();
    copyElement(src, tgt);
    tgt.setSystem(convertContactPointSystem(src.getSystem()));
    tgt.setValue(src.getValue());
    tgt.setUse(convertContactPointUse(src.getUse()));
    tgt.setRank(src.getRank());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ContactPoint convertContactPoint(org.hl7.fhir.dstu3.model.ContactPoint src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ContactPoint tgt = new org.hl7.fhir.dstu2016may.model.ContactPoint();
    copyElement(src, tgt);
    tgt.setSystem(convertContactPointSystem(src.getSystem()));
    tgt.setValue(src.getValue());
    tgt.setUse(convertContactPointUse(src.getUse()));
    tgt.setRank(src.getRank());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.ContactPoint.ContactPointSystem convertContactPointSystem(org.hl7.fhir.dstu2016may.model.ContactPoint.ContactPointSystem src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case PHONE: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointSystem.PHONE;
    case FAX: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointSystem.FAX;
    case EMAIL: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointSystem.EMAIL;
    case PAGER: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointSystem.PAGER;
    case OTHER: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointSystem.OTHER;
    default: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointSystem.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.ContactPoint.ContactPointSystem convertContactPointSystem(org.hl7.fhir.dstu3.model.ContactPoint.ContactPointSystem src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case PHONE: return org.hl7.fhir.dstu2016may.model.ContactPoint.ContactPointSystem.PHONE;
    case FAX: return org.hl7.fhir.dstu2016may.model.ContactPoint.ContactPointSystem.FAX;
    case EMAIL: return org.hl7.fhir.dstu2016may.model.ContactPoint.ContactPointSystem.EMAIL;
    case PAGER: return org.hl7.fhir.dstu2016may.model.ContactPoint.ContactPointSystem.PAGER;
    case OTHER: return org.hl7.fhir.dstu2016may.model.ContactPoint.ContactPointSystem.OTHER;
    default: return org.hl7.fhir.dstu2016may.model.ContactPoint.ContactPointSystem.NULL;
    }
  }

  private static org.hl7.fhir.dstu3.model.ContactPoint.ContactPointUse convertContactPointUse(org.hl7.fhir.dstu2016may.model.ContactPoint.ContactPointUse src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case HOME: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointUse.HOME;
    case WORK: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointUse.WORK;
    case TEMP: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointUse.TEMP;
    case OLD: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointUse.OLD;
    case MOBILE: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointUse.MOBILE;
    default: return org.hl7.fhir.dstu3.model.ContactPoint.ContactPointUse.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.ContactPoint.ContactPointUse convertContactPointUse(org.hl7.fhir.dstu3.model.ContactPoint.ContactPointUse src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case HOME: return org.hl7.fhir.dstu2016may.model.ContactPoint.ContactPointUse.HOME;
    case WORK: return org.hl7.fhir.dstu2016may.model.ContactPoint.ContactPointUse.WORK;
    case TEMP: return org.hl7.fhir.dstu2016may.model.ContactPoint.ContactPointUse.TEMP;
    case OLD: return org.hl7.fhir.dstu2016may.model.ContactPoint.ContactPointUse.OLD;
    case MOBILE: return org.hl7.fhir.dstu2016may.model.ContactPoint.ContactPointUse.MOBILE;
    default: return org.hl7.fhir.dstu2016may.model.ContactPoint.ContactPointUse.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.ElementDefinition convertElementDefinition(org.hl7.fhir.dstu2016may.model.ElementDefinition src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ElementDefinition tgt = new org.hl7.fhir.dstu3.model.ElementDefinition();
    copyElement(src, tgt);
    tgt.setPath(src.getPath());
    for (org.hl7.fhir.dstu2016may.model.Enumeration<org.hl7.fhir.dstu2016may.model.ElementDefinition.PropertyRepresentation> t : src.getRepresentation())
      tgt.addRepresentation(convertPropertyRepresentation(t.getValue()));
    tgt.setName(src.getName());
    tgt.setLabel(src.getLabel());
    for (org.hl7.fhir.dstu2016may.model.Coding t : src.getCode())
      tgt.addCode(convertCoding(t));
    tgt.setSlicing(convertElementDefinitionSlicingComponent(src.getSlicing()));
    tgt.setShort(src.getShort());
    tgt.setDefinition(src.getDefinition());
    tgt.setComments(src.getComments());
    tgt.setRequirements(src.getRequirements());
    for (org.hl7.fhir.dstu2016may.model.StringType t : src.getAlias())
      tgt.addAlias(t.getValue());
    tgt.setMin(src.getMin());
    tgt.setMax(src.getMax());
    tgt.setBase(convertElementDefinitionBaseComponent(src.getBase()));
    tgt.setContentReference(src.getContentReference());
    for (org.hl7.fhir.dstu2016may.model.ElementDefinition.TypeRefComponent t : src.getType())
      tgt.addType(convertTypeRefComponent(t));
    tgt.setDefaultValue(convertType(src.getDefaultValue()));
    tgt.setMeaningWhenMissing(src.getMeaningWhenMissing());
    tgt.setFixed(convertType(src.getFixed()));
    tgt.setPattern(convertType(src.getPattern()));
    tgt.setExample(convertType(src.getExample()));
    tgt.setMinValue(convertType(src.getMinValue()));
    tgt.setMaxValue(convertType(src.getMaxValue()));
    tgt.setMaxLength(src.getMaxLength());
    for (org.hl7.fhir.dstu2016may.model.IdType t : src.getCondition())
      tgt.addCondition(t.getValue());
    for (org.hl7.fhir.dstu2016may.model.ElementDefinition.ElementDefinitionConstraintComponent t : src.getConstraint())
      tgt.addConstraint(convertElementDefinitionConstraintComponent(t));
    tgt.setMustSupport(src.getMustSupport());
    tgt.setIsModifier(src.getIsModifier());
    tgt.setIsSummary(src.getIsSummary());
    tgt.setBinding(convertElementDefinitionBindingComponent(src.getBinding()));
    for (org.hl7.fhir.dstu2016may.model.ElementDefinition.ElementDefinitionMappingComponent t : src.getMapping())
      tgt.addMapping(convertElementDefinitionMappingComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ElementDefinition convertElementDefinition(org.hl7.fhir.dstu3.model.ElementDefinition src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ElementDefinition tgt = new org.hl7.fhir.dstu2016may.model.ElementDefinition();
    copyElement(src, tgt);
    tgt.setPath(src.getPath());
    for (org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.ElementDefinition.PropertyRepresentation> t : src.getRepresentation())
      tgt.addRepresentation(convertPropertyRepresentation(t.getValue()));
    tgt.setName(src.getName());
    tgt.setLabel(src.getLabel());
    for (org.hl7.fhir.dstu3.model.Coding t : src.getCode())
      tgt.addCode(convertCoding(t));
    tgt.setSlicing(convertElementDefinitionSlicingComponent(src.getSlicing()));
    tgt.setShort(src.getShort());
    tgt.setDefinition(src.getDefinition());
    tgt.setComments(src.getComments());
    tgt.setRequirements(src.getRequirements());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getAlias())
      tgt.addAlias(t.getValue());
    tgt.setMin(src.getMin());
    tgt.setMax(src.getMax());
    tgt.setBase(convertElementDefinitionBaseComponent(src.getBase()));
    tgt.setContentReference(src.getContentReference());
    for (org.hl7.fhir.dstu3.model.ElementDefinition.TypeRefComponent t : src.getType())
      tgt.addType(convertTypeRefComponent(t));
    tgt.setDefaultValue(convertType(src.getDefaultValue()));
    tgt.setMeaningWhenMissing(src.getMeaningWhenMissing());
    tgt.setFixed(convertType(src.getFixed()));
    tgt.setPattern(convertType(src.getPattern()));
    tgt.setExample(convertType(src.getExample()));
    tgt.setMinValue(convertType(src.getMinValue()));
    tgt.setMaxValue(convertType(src.getMaxValue()));
    tgt.setMaxLength(src.getMaxLength());
    for (org.hl7.fhir.dstu3.model.IdType t : src.getCondition())
      tgt.addCondition(t.getValue());
    for (org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionConstraintComponent t : src.getConstraint())
      tgt.addConstraint(convertElementDefinitionConstraintComponent(t));
    tgt.setMustSupport(src.getMustSupport());
    tgt.setIsModifier(src.getIsModifier());
    tgt.setIsSummary(src.getIsSummary());
    tgt.setBinding(convertElementDefinitionBindingComponent(src.getBinding()));
    for (org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionMappingComponent t : src.getMapping())
      tgt.addMapping(convertElementDefinitionMappingComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.ElementDefinition.PropertyRepresentation convertPropertyRepresentation(org.hl7.fhir.dstu2016may.model.ElementDefinition.PropertyRepresentation src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case XMLATTR: return org.hl7.fhir.dstu3.model.ElementDefinition.PropertyRepresentation.XMLATTR;
    case XMLTEXT: return org.hl7.fhir.dstu3.model.ElementDefinition.PropertyRepresentation.XMLTEXT;
    case TYPEATTR: return org.hl7.fhir.dstu3.model.ElementDefinition.PropertyRepresentation.TYPEATTR;
    case CDATEXT: return org.hl7.fhir.dstu3.model.ElementDefinition.PropertyRepresentation.CDATEXT;
    default: return org.hl7.fhir.dstu3.model.ElementDefinition.PropertyRepresentation.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.ElementDefinition.PropertyRepresentation convertPropertyRepresentation(org.hl7.fhir.dstu3.model.ElementDefinition.PropertyRepresentation src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case XMLATTR: return org.hl7.fhir.dstu2016may.model.ElementDefinition.PropertyRepresentation.XMLATTR;
    case XMLTEXT: return org.hl7.fhir.dstu2016may.model.ElementDefinition.PropertyRepresentation.XMLTEXT;
    case TYPEATTR: return org.hl7.fhir.dstu2016may.model.ElementDefinition.PropertyRepresentation.TYPEATTR;
    case CDATEXT: return org.hl7.fhir.dstu2016may.model.ElementDefinition.PropertyRepresentation.CDATEXT;
    default: return org.hl7.fhir.dstu2016may.model.ElementDefinition.PropertyRepresentation.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionSlicingComponent convertElementDefinitionSlicingComponent(org.hl7.fhir.dstu2016may.model.ElementDefinition.ElementDefinitionSlicingComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionSlicingComponent tgt = new org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionSlicingComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2016may.model.StringType t : src.getDiscriminator())
      tgt.addDiscriminator(t.getValue());
    tgt.setDescription(src.getDescription());
    tgt.setOrdered(src.getOrdered());
    tgt.setRules(convertSlicingRules(src.getRules()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ElementDefinition.ElementDefinitionSlicingComponent convertElementDefinitionSlicingComponent(org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionSlicingComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ElementDefinition.ElementDefinitionSlicingComponent tgt = new org.hl7.fhir.dstu2016may.model.ElementDefinition.ElementDefinitionSlicingComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.StringType t : src.getDiscriminator())
      tgt.addDiscriminator(t.getValue());
    tgt.setDescription(src.getDescription());
    tgt.setOrdered(src.getOrdered());
    tgt.setRules(convertSlicingRules(src.getRules()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.ElementDefinition.SlicingRules convertSlicingRules(org.hl7.fhir.dstu2016may.model.ElementDefinition.SlicingRules src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case CLOSED: return org.hl7.fhir.dstu3.model.ElementDefinition.SlicingRules.CLOSED;
    case OPEN: return org.hl7.fhir.dstu3.model.ElementDefinition.SlicingRules.OPEN;
    case OPENATEND: return org.hl7.fhir.dstu3.model.ElementDefinition.SlicingRules.OPENATEND;
    default: return org.hl7.fhir.dstu3.model.ElementDefinition.SlicingRules.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.ElementDefinition.SlicingRules convertSlicingRules(org.hl7.fhir.dstu3.model.ElementDefinition.SlicingRules src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case CLOSED: return org.hl7.fhir.dstu2016may.model.ElementDefinition.SlicingRules.CLOSED;
    case OPEN: return org.hl7.fhir.dstu2016may.model.ElementDefinition.SlicingRules.OPEN;
    case OPENATEND: return org.hl7.fhir.dstu2016may.model.ElementDefinition.SlicingRules.OPENATEND;
    default: return org.hl7.fhir.dstu2016may.model.ElementDefinition.SlicingRules.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionBaseComponent convertElementDefinitionBaseComponent(org.hl7.fhir.dstu2016may.model.ElementDefinition.ElementDefinitionBaseComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionBaseComponent tgt = new org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionBaseComponent();
    copyElement(src, tgt);
    tgt.setPath(src.getPath());
    tgt.setMin(src.getMin());
    tgt.setMax(src.getMax());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ElementDefinition.ElementDefinitionBaseComponent convertElementDefinitionBaseComponent(org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionBaseComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ElementDefinition.ElementDefinitionBaseComponent tgt = new org.hl7.fhir.dstu2016may.model.ElementDefinition.ElementDefinitionBaseComponent();
    copyElement(src, tgt);
    tgt.setPath(src.getPath());
    tgt.setMin(src.getMin());
    tgt.setMax(src.getMax());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ElementDefinition.TypeRefComponent convertTypeRefComponent(org.hl7.fhir.dstu2016may.model.ElementDefinition.TypeRefComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ElementDefinition.TypeRefComponent tgt = new org.hl7.fhir.dstu3.model.ElementDefinition.TypeRefComponent();
    copyElement(src, tgt);
    tgt.setCode(src.getCode());
    for (org.hl7.fhir.dstu2016may.model.UriType t : src.getProfile())
      tgt.setProfile(t.getValueAsString());
    for (org.hl7.fhir.dstu2016may.model.Enumeration<org.hl7.fhir.dstu2016may.model.ElementDefinition.AggregationMode> t : src.getAggregation())
      tgt.addAggregation(convertAggregationMode(t.getValue()));
    tgt.setVersioning(convertReferenceVersionRules(src.getVersioning()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ElementDefinition.TypeRefComponent convertTypeRefComponent(org.hl7.fhir.dstu3.model.ElementDefinition.TypeRefComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ElementDefinition.TypeRefComponent tgt = new org.hl7.fhir.dstu2016may.model.ElementDefinition.TypeRefComponent();
    copyElement(src, tgt);
    tgt.setCode(src.getCode());
    tgt.addProfile(src.getProfile());
    for (org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.ElementDefinition.AggregationMode> t : src.getAggregation())
      tgt.addAggregation(convertAggregationMode(t.getValue()));
    tgt.setVersioning(convertReferenceVersionRules(src.getVersioning()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.ElementDefinition.AggregationMode convertAggregationMode(org.hl7.fhir.dstu2016may.model.ElementDefinition.AggregationMode src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case CONTAINED: return org.hl7.fhir.dstu3.model.ElementDefinition.AggregationMode.CONTAINED;
    case REFERENCED: return org.hl7.fhir.dstu3.model.ElementDefinition.AggregationMode.REFERENCED;
    case BUNDLED: return org.hl7.fhir.dstu3.model.ElementDefinition.AggregationMode.BUNDLED;
    default: return org.hl7.fhir.dstu3.model.ElementDefinition.AggregationMode.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.ElementDefinition.AggregationMode convertAggregationMode(org.hl7.fhir.dstu3.model.ElementDefinition.AggregationMode src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case CONTAINED: return org.hl7.fhir.dstu2016may.model.ElementDefinition.AggregationMode.CONTAINED;
    case REFERENCED: return org.hl7.fhir.dstu2016may.model.ElementDefinition.AggregationMode.REFERENCED;
    case BUNDLED: return org.hl7.fhir.dstu2016may.model.ElementDefinition.AggregationMode.BUNDLED;
    default: return org.hl7.fhir.dstu2016may.model.ElementDefinition.AggregationMode.NULL;
    }
  }

  private static org.hl7.fhir.dstu3.model.ElementDefinition.ReferenceVersionRules convertReferenceVersionRules(org.hl7.fhir.dstu2016may.model.ElementDefinition.ReferenceVersionRules src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case EITHER: return org.hl7.fhir.dstu3.model.ElementDefinition.ReferenceVersionRules.EITHER;
    case INDEPENDENT: return org.hl7.fhir.dstu3.model.ElementDefinition.ReferenceVersionRules.INDEPENDENT;
    case SPECIFIC: return org.hl7.fhir.dstu3.model.ElementDefinition.ReferenceVersionRules.SPECIFIC;
    default: return org.hl7.fhir.dstu3.model.ElementDefinition.ReferenceVersionRules.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.ElementDefinition.ReferenceVersionRules convertReferenceVersionRules(org.hl7.fhir.dstu3.model.ElementDefinition.ReferenceVersionRules src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case EITHER: return org.hl7.fhir.dstu2016may.model.ElementDefinition.ReferenceVersionRules.EITHER;
    case INDEPENDENT: return org.hl7.fhir.dstu2016may.model.ElementDefinition.ReferenceVersionRules.INDEPENDENT;
    case SPECIFIC: return org.hl7.fhir.dstu2016may.model.ElementDefinition.ReferenceVersionRules.SPECIFIC;
    default: return org.hl7.fhir.dstu2016may.model.ElementDefinition.ReferenceVersionRules.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionConstraintComponent convertElementDefinitionConstraintComponent(org.hl7.fhir.dstu2016may.model.ElementDefinition.ElementDefinitionConstraintComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionConstraintComponent tgt = new org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionConstraintComponent();
    copyElement(src, tgt);
    tgt.setKey(src.getKey());
    tgt.setRequirements(src.getRequirements());
    tgt.setSeverity(convertConstraintSeverity(src.getSeverity()));
    tgt.setHuman(src.getHuman());
    tgt.setExpression(src.getExpression());
    tgt.setXpath(src.getXpath());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ElementDefinition.ElementDefinitionConstraintComponent convertElementDefinitionConstraintComponent(org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionConstraintComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ElementDefinition.ElementDefinitionConstraintComponent tgt = new org.hl7.fhir.dstu2016may.model.ElementDefinition.ElementDefinitionConstraintComponent();
    copyElement(src, tgt);
    tgt.setKey(src.getKey());
    tgt.setRequirements(src.getRequirements());
    tgt.setSeverity(convertConstraintSeverity(src.getSeverity()));
    tgt.setHuman(src.getHuman());
    tgt.setExpression(src.getExpression());
    tgt.setXpath(src.getXpath());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.ElementDefinition.ConstraintSeverity convertConstraintSeverity(org.hl7.fhir.dstu2016may.model.ElementDefinition.ConstraintSeverity src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case ERROR: return org.hl7.fhir.dstu3.model.ElementDefinition.ConstraintSeverity.ERROR;
    case WARNING: return org.hl7.fhir.dstu3.model.ElementDefinition.ConstraintSeverity.WARNING;
    default: return org.hl7.fhir.dstu3.model.ElementDefinition.ConstraintSeverity.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.ElementDefinition.ConstraintSeverity convertConstraintSeverity(org.hl7.fhir.dstu3.model.ElementDefinition.ConstraintSeverity src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case ERROR: return org.hl7.fhir.dstu2016may.model.ElementDefinition.ConstraintSeverity.ERROR;
    case WARNING: return org.hl7.fhir.dstu2016may.model.ElementDefinition.ConstraintSeverity.WARNING;
    default: return org.hl7.fhir.dstu2016may.model.ElementDefinition.ConstraintSeverity.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionBindingComponent convertElementDefinitionBindingComponent(org.hl7.fhir.dstu2016may.model.ElementDefinition.ElementDefinitionBindingComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionBindingComponent tgt = new org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionBindingComponent();
    copyElement(src, tgt);
    tgt.setStrength(convertBindingStrength(src.getStrength()));
    tgt.setDescription(src.getDescription());
    tgt.setValueSet(convertType(src.getValueSet()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ElementDefinition.ElementDefinitionBindingComponent convertElementDefinitionBindingComponent(org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionBindingComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ElementDefinition.ElementDefinitionBindingComponent tgt = new org.hl7.fhir.dstu2016may.model.ElementDefinition.ElementDefinitionBindingComponent();
    copyElement(src, tgt);
    tgt.setStrength(convertBindingStrength(src.getStrength()));
    tgt.setDescription(src.getDescription());
    tgt.setValueSet(convertType(src.getValueSet()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Enumerations.BindingStrength convertBindingStrength(org.hl7.fhir.dstu2016may.model.Enumerations.BindingStrength src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case REQUIRED: return org.hl7.fhir.dstu3.model.Enumerations.BindingStrength.REQUIRED;
    case EXTENSIBLE: return org.hl7.fhir.dstu3.model.Enumerations.BindingStrength.EXTENSIBLE;
    case PREFERRED: return org.hl7.fhir.dstu3.model.Enumerations.BindingStrength.PREFERRED;
    case EXAMPLE: return org.hl7.fhir.dstu3.model.Enumerations.BindingStrength.EXAMPLE;
    default: return org.hl7.fhir.dstu3.model.Enumerations.BindingStrength.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Enumerations.BindingStrength convertBindingStrength(org.hl7.fhir.dstu3.model.Enumerations.BindingStrength src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case REQUIRED: return org.hl7.fhir.dstu2016may.model.Enumerations.BindingStrength.REQUIRED;
    case EXTENSIBLE: return org.hl7.fhir.dstu2016may.model.Enumerations.BindingStrength.EXTENSIBLE;
    case PREFERRED: return org.hl7.fhir.dstu2016may.model.Enumerations.BindingStrength.PREFERRED;
    case EXAMPLE: return org.hl7.fhir.dstu2016may.model.Enumerations.BindingStrength.EXAMPLE;
    default: return org.hl7.fhir.dstu2016may.model.Enumerations.BindingStrength.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionMappingComponent convertElementDefinitionMappingComponent(org.hl7.fhir.dstu2016may.model.ElementDefinition.ElementDefinitionMappingComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionMappingComponent tgt = new org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionMappingComponent();
    copyElement(src, tgt);
    tgt.setIdentity(src.getIdentity());
    tgt.setLanguage(src.getLanguage());
    tgt.setMap(src.getMap());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ElementDefinition.ElementDefinitionMappingComponent convertElementDefinitionMappingComponent(org.hl7.fhir.dstu3.model.ElementDefinition.ElementDefinitionMappingComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ElementDefinition.ElementDefinitionMappingComponent tgt = new org.hl7.fhir.dstu2016may.model.ElementDefinition.ElementDefinitionMappingComponent();
    copyElement(src, tgt);
    tgt.setIdentity(src.getIdentity());
    tgt.setLanguage(src.getLanguage());
    tgt.setMap(src.getMap());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.HumanName convertHumanName(org.hl7.fhir.dstu2016may.model.HumanName src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.HumanName tgt = new org.hl7.fhir.dstu3.model.HumanName();
    copyElement(src, tgt);
    tgt.setUse(convertNameUse(src.getUse()));
    tgt.setText(src.getText());
    for (org.hl7.fhir.dstu2016may.model.StringType t : src.getFamily())
      tgt.addFamily(t.getValue());
    for (org.hl7.fhir.dstu2016may.model.StringType t : src.getGiven())
      tgt.addGiven(t.getValue());
    for (org.hl7.fhir.dstu2016may.model.StringType t : src.getPrefix())
      tgt.addPrefix(t.getValue());
    for (org.hl7.fhir.dstu2016may.model.StringType t : src.getSuffix())
      tgt.addSuffix(t.getValue());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.HumanName convertHumanName(org.hl7.fhir.dstu3.model.HumanName src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.HumanName tgt = new org.hl7.fhir.dstu2016may.model.HumanName();
    copyElement(src, tgt);
    tgt.setUse(convertNameUse(src.getUse()));
    tgt.setText(src.getText());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getFamily())
      tgt.addFamily(t.getValue());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getGiven())
      tgt.addGiven(t.getValue());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getPrefix())
      tgt.addPrefix(t.getValue());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getSuffix())
      tgt.addSuffix(t.getValue());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.HumanName.NameUse convertNameUse(org.hl7.fhir.dstu2016may.model.HumanName.NameUse src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case USUAL: return org.hl7.fhir.dstu3.model.HumanName.NameUse.USUAL;
    case OFFICIAL: return org.hl7.fhir.dstu3.model.HumanName.NameUse.OFFICIAL;
    case TEMP: return org.hl7.fhir.dstu3.model.HumanName.NameUse.TEMP;
    case NICKNAME: return org.hl7.fhir.dstu3.model.HumanName.NameUse.NICKNAME;
    case ANONYMOUS: return org.hl7.fhir.dstu3.model.HumanName.NameUse.ANONYMOUS;
    case OLD: return org.hl7.fhir.dstu3.model.HumanName.NameUse.OLD;
    case MAIDEN: return org.hl7.fhir.dstu3.model.HumanName.NameUse.MAIDEN;
    default: return org.hl7.fhir.dstu3.model.HumanName.NameUse.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.HumanName.NameUse convertNameUse(org.hl7.fhir.dstu3.model.HumanName.NameUse src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case USUAL: return org.hl7.fhir.dstu2016may.model.HumanName.NameUse.USUAL;
    case OFFICIAL: return org.hl7.fhir.dstu2016may.model.HumanName.NameUse.OFFICIAL;
    case TEMP: return org.hl7.fhir.dstu2016may.model.HumanName.NameUse.TEMP;
    case NICKNAME: return org.hl7.fhir.dstu2016may.model.HumanName.NameUse.NICKNAME;
    case ANONYMOUS: return org.hl7.fhir.dstu2016may.model.HumanName.NameUse.ANONYMOUS;
    case OLD: return org.hl7.fhir.dstu2016may.model.HumanName.NameUse.OLD;
    case MAIDEN: return org.hl7.fhir.dstu2016may.model.HumanName.NameUse.MAIDEN;
    default: return org.hl7.fhir.dstu2016may.model.HumanName.NameUse.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.Meta convertMeta(org.hl7.fhir.dstu2016may.model.Meta src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Meta tgt = new org.hl7.fhir.dstu3.model.Meta();
    copyElement(src, tgt);
    tgt.setVersionId(src.getVersionId());
    tgt.setLastUpdated(src.getLastUpdated());
    for (org.hl7.fhir.dstu2016may.model.UriType t : src.getProfile())
      tgt.addProfile(t.getValue());
    for (org.hl7.fhir.dstu2016may.model.Coding t : src.getSecurity())
      tgt.addSecurity(convertCoding(t));
    for (org.hl7.fhir.dstu2016may.model.Coding t : src.getTag())
      tgt.addTag(convertCoding(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Meta convertMeta(org.hl7.fhir.dstu3.model.Meta src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Meta tgt = new org.hl7.fhir.dstu2016may.model.Meta();
    copyElement(src, tgt);
    tgt.setVersionId(src.getVersionId());
    tgt.setLastUpdated(src.getLastUpdated());
    for (org.hl7.fhir.dstu3.model.UriType t : src.getProfile())
      tgt.addProfile(t.getValue());
    for (org.hl7.fhir.dstu3.model.Coding t : src.getSecurity())
      tgt.addSecurity(convertCoding(t));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getTag())
      tgt.addTag(convertCoding(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Timing convertTiming(org.hl7.fhir.dstu2016may.model.Timing src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Timing tgt = new org.hl7.fhir.dstu3.model.Timing();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2016may.model.DateTimeType t : src.getEvent())
      tgt.addEvent(t.getValue());
    tgt.setRepeat(convertTimingRepeatComponent(src.getRepeat()));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Timing convertTiming(org.hl7.fhir.dstu3.model.Timing src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Timing tgt = new org.hl7.fhir.dstu2016may.model.Timing();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.DateTimeType t : src.getEvent())
      tgt.addEvent(t.getValue());
    tgt.setRepeat(convertTimingRepeatComponent(src.getRepeat()));
    tgt.setCode(convertCodeableConcept(src.getCode()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Timing.TimingRepeatComponent convertTimingRepeatComponent(org.hl7.fhir.dstu2016may.model.Timing.TimingRepeatComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Timing.TimingRepeatComponent tgt = new org.hl7.fhir.dstu3.model.Timing.TimingRepeatComponent();
    copyElement(src, tgt);
    tgt.setBounds(convertType(src.getBounds()));
    tgt.setCount(src.getCount());
    tgt.setCountMax(src.getCountMax());
    tgt.setDuration(src.getDuration());
    tgt.setDurationMax(src.getDurationMax());
    tgt.setDurationUnit(convertUnitsOfTime(src.getDurationUnit()));
    tgt.setFrequency(src.getFrequency());
    tgt.setFrequencyMax(src.getFrequencyMax());
    tgt.setPeriod(src.getPeriod());
    tgt.setPeriodMax(src.getPeriodMax());
    tgt.setPeriodUnit(convertUnitsOfTime(src.getPeriodUnit()));
    tgt.setWhen(convertEventTiming(src.getWhen()));
    tgt.setOffset(src.getOffset());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Timing.TimingRepeatComponent convertTimingRepeatComponent(org.hl7.fhir.dstu3.model.Timing.TimingRepeatComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Timing.TimingRepeatComponent tgt = new org.hl7.fhir.dstu2016may.model.Timing.TimingRepeatComponent();
    copyElement(src, tgt);
    tgt.setBounds(convertType(src.getBounds()));
    tgt.setCount(src.getCount());
    tgt.setCountMax(src.getCountMax());
    tgt.setDuration(src.getDuration());
    tgt.setDurationMax(src.getDurationMax());
    tgt.setDurationUnit(convertUnitsOfTime(src.getDurationUnit()));
    tgt.setFrequency(src.getFrequency());
    tgt.setFrequencyMax(src.getFrequencyMax());
    tgt.setPeriod(src.getPeriod());
    tgt.setPeriodMax(src.getPeriodMax());
    tgt.setPeriodUnit(convertUnitsOfTime(src.getPeriodUnit()));
    tgt.setWhen(convertEventTiming(src.getWhen()));
    tgt.setOffset(src.getOffset());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Timing.UnitsOfTime convertUnitsOfTime(org.hl7.fhir.dstu2016may.model.Timing.UnitsOfTime src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case S: return org.hl7.fhir.dstu3.model.Timing.UnitsOfTime.S;
    case MIN: return org.hl7.fhir.dstu3.model.Timing.UnitsOfTime.MIN;
    case H: return org.hl7.fhir.dstu3.model.Timing.UnitsOfTime.H;
    case D: return org.hl7.fhir.dstu3.model.Timing.UnitsOfTime.D;
    case WK: return org.hl7.fhir.dstu3.model.Timing.UnitsOfTime.WK;
    case MO: return org.hl7.fhir.dstu3.model.Timing.UnitsOfTime.MO;
    case A: return org.hl7.fhir.dstu3.model.Timing.UnitsOfTime.A;
    default: return org.hl7.fhir.dstu3.model.Timing.UnitsOfTime.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Timing.UnitsOfTime convertUnitsOfTime(org.hl7.fhir.dstu3.model.Timing.UnitsOfTime src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case S: return org.hl7.fhir.dstu2016may.model.Timing.UnitsOfTime.S;
    case MIN: return org.hl7.fhir.dstu2016may.model.Timing.UnitsOfTime.MIN;
    case H: return org.hl7.fhir.dstu2016may.model.Timing.UnitsOfTime.H;
    case D: return org.hl7.fhir.dstu2016may.model.Timing.UnitsOfTime.D;
    case WK: return org.hl7.fhir.dstu2016may.model.Timing.UnitsOfTime.WK;
    case MO: return org.hl7.fhir.dstu2016may.model.Timing.UnitsOfTime.MO;
    case A: return org.hl7.fhir.dstu2016may.model.Timing.UnitsOfTime.A;
    default: return org.hl7.fhir.dstu2016may.model.Timing.UnitsOfTime.NULL;
    }
  }

  private static org.hl7.fhir.dstu3.model.Timing.EventTiming convertEventTiming(org.hl7.fhir.dstu2016may.model.Timing.EventTiming src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case HS: return org.hl7.fhir.dstu3.model.Timing.EventTiming.HS;
    case WAKE: return org.hl7.fhir.dstu3.model.Timing.EventTiming.WAKE;
    case C: return org.hl7.fhir.dstu3.model.Timing.EventTiming.C;
    case CM: return org.hl7.fhir.dstu3.model.Timing.EventTiming.CM;
    case CD: return org.hl7.fhir.dstu3.model.Timing.EventTiming.CD;
    case CV: return org.hl7.fhir.dstu3.model.Timing.EventTiming.CV;
    case AC: return org.hl7.fhir.dstu3.model.Timing.EventTiming.AC;
    case ACM: return org.hl7.fhir.dstu3.model.Timing.EventTiming.ACM;
    case ACD: return org.hl7.fhir.dstu3.model.Timing.EventTiming.ACD;
    case ACV: return org.hl7.fhir.dstu3.model.Timing.EventTiming.ACV;
    case PC: return org.hl7.fhir.dstu3.model.Timing.EventTiming.PC;
    case PCM: return org.hl7.fhir.dstu3.model.Timing.EventTiming.PCM;
    case PCD: return org.hl7.fhir.dstu3.model.Timing.EventTiming.PCD;
    case PCV: return org.hl7.fhir.dstu3.model.Timing.EventTiming.PCV;
    default: return org.hl7.fhir.dstu3.model.Timing.EventTiming.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Timing.EventTiming convertEventTiming(org.hl7.fhir.dstu3.model.Timing.EventTiming src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case HS: return org.hl7.fhir.dstu2016may.model.Timing.EventTiming.HS;
    case WAKE: return org.hl7.fhir.dstu2016may.model.Timing.EventTiming.WAKE;
    case C: return org.hl7.fhir.dstu2016may.model.Timing.EventTiming.C;
    case CM: return org.hl7.fhir.dstu2016may.model.Timing.EventTiming.CM;
    case CD: return org.hl7.fhir.dstu2016may.model.Timing.EventTiming.CD;
    case CV: return org.hl7.fhir.dstu2016may.model.Timing.EventTiming.CV;
    case AC: return org.hl7.fhir.dstu2016may.model.Timing.EventTiming.AC;
    case ACM: return org.hl7.fhir.dstu2016may.model.Timing.EventTiming.ACM;
    case ACD: return org.hl7.fhir.dstu2016may.model.Timing.EventTiming.ACD;
    case ACV: return org.hl7.fhir.dstu2016may.model.Timing.EventTiming.ACV;
    case PC: return org.hl7.fhir.dstu2016may.model.Timing.EventTiming.PC;
    case PCM: return org.hl7.fhir.dstu2016may.model.Timing.EventTiming.PCM;
    case PCD: return org.hl7.fhir.dstu2016may.model.Timing.EventTiming.PCD;
    case PCV: return org.hl7.fhir.dstu2016may.model.Timing.EventTiming.PCV;
    default: return org.hl7.fhir.dstu2016may.model.Timing.EventTiming.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.SimpleQuantity convertSimpleQuantity(org.hl7.fhir.dstu2016may.model.SimpleQuantity src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.SimpleQuantity tgt = new org.hl7.fhir.dstu3.model.SimpleQuantity();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.SimpleQuantity convertSimpleQuantity(org.hl7.fhir.dstu3.model.SimpleQuantity src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.SimpleQuantity tgt = new org.hl7.fhir.dstu2016may.model.SimpleQuantity();
    copyElement(src, tgt);
    tgt.setValue(src.getValue());
    tgt.setComparator(convertQuantityComparator(src.getComparator()));
    tgt.setUnit(src.getUnit());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Type convertType(org.hl7.fhir.dstu2016may.model.Type src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    if (src instanceof org.hl7.fhir.dstu2016may.model.Base64BinaryType)
      return convertBase64Binary((org.hl7.fhir.dstu2016may.model.Base64BinaryType) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.BooleanType)
      return convertBoolean((org.hl7.fhir.dstu2016may.model.BooleanType) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.CodeType)
      return convertCode((org.hl7.fhir.dstu2016may.model.CodeType) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.DateType)
      return convertDate((org.hl7.fhir.dstu2016may.model.DateType) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.DateTimeType)
      return convertDateTime((org.hl7.fhir.dstu2016may.model.DateTimeType) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.DecimalType)
      return convertDecimal((org.hl7.fhir.dstu2016may.model.DecimalType) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.IdType)
      return convertId((org.hl7.fhir.dstu2016may.model.IdType) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.InstantType)
      return convertInstant((org.hl7.fhir.dstu2016may.model.InstantType) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.IntegerType)
      return convertInteger((org.hl7.fhir.dstu2016may.model.IntegerType) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.MarkdownType)
      return convertMarkdown((org.hl7.fhir.dstu2016may.model.MarkdownType) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.OidType)
      return convertOid((org.hl7.fhir.dstu2016may.model.OidType) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.PositiveIntType)
      return convertPositiveInt((org.hl7.fhir.dstu2016may.model.PositiveIntType) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.StringType)
      return convertString((org.hl7.fhir.dstu2016may.model.StringType) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.TimeType)
      return convertTime((org.hl7.fhir.dstu2016may.model.TimeType) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.UnsignedIntType)
      return convertUnsignedInt((org.hl7.fhir.dstu2016may.model.UnsignedIntType) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.UriType)
      return convertUri((org.hl7.fhir.dstu2016may.model.UriType) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.UuidType)
      return convertUuid((org.hl7.fhir.dstu2016may.model.UuidType) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.Extension)
      return convertExtension((org.hl7.fhir.dstu2016may.model.Extension) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.Narrative)
      return convertNarrative((org.hl7.fhir.dstu2016may.model.Narrative) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.Age)
      return convertAge((org.hl7.fhir.dstu2016may.model.Age) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.Annotation)
      return convertAnnotation((org.hl7.fhir.dstu2016may.model.Annotation) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.Attachment)
      return convertAttachment((org.hl7.fhir.dstu2016may.model.Attachment) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.CodeableConcept)
      return convertCodeableConcept((org.hl7.fhir.dstu2016may.model.CodeableConcept) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.Coding)
      return convertCoding((org.hl7.fhir.dstu2016may.model.Coding) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.Count)
      return convertCount((org.hl7.fhir.dstu2016may.model.Count) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.Distance)
      return convertDistance((org.hl7.fhir.dstu2016may.model.Distance) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.Duration)
      return convertDuration((org.hl7.fhir.dstu2016may.model.Duration) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.Identifier)
      return convertIdentifier((org.hl7.fhir.dstu2016may.model.Identifier) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.Money)
      return convertMoney((org.hl7.fhir.dstu2016may.model.Money) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.Period)
      return convertPeriod((org.hl7.fhir.dstu2016may.model.Period) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.Quantity)
      return convertQuantity((org.hl7.fhir.dstu2016may.model.Quantity) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.Range)
      return convertRange((org.hl7.fhir.dstu2016may.model.Range) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.Ratio)
      return convertRatio((org.hl7.fhir.dstu2016may.model.Ratio) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.Reference)
      return convertReference((org.hl7.fhir.dstu2016may.model.Reference) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.SampledData)
      return convertSampledData((org.hl7.fhir.dstu2016may.model.SampledData) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.Signature)
      return convertSignature((org.hl7.fhir.dstu2016may.model.Signature) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.Address)
      return convertAddress((org.hl7.fhir.dstu2016may.model.Address) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.ContactPoint)
      return convertContactPoint((org.hl7.fhir.dstu2016may.model.ContactPoint) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.ElementDefinition)
      return convertElementDefinition((org.hl7.fhir.dstu2016may.model.ElementDefinition) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.HumanName)
      return convertHumanName((org.hl7.fhir.dstu2016may.model.HumanName) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.Meta)
      return convertMeta((org.hl7.fhir.dstu2016may.model.Meta) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.Timing)
      return convertTiming((org.hl7.fhir.dstu2016may.model.Timing) src);
    throw new Error("Unknown type "+src.fhirType());
  }

  public static org.hl7.fhir.dstu2016may.model.Type convertType(org.hl7.fhir.dstu3.model.Type src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    if (src instanceof org.hl7.fhir.dstu3.model.Base64BinaryType)
      return convertBase64Binary((org.hl7.fhir.dstu3.model.Base64BinaryType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.BooleanType)
      return convertBoolean((org.hl7.fhir.dstu3.model.BooleanType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.CodeType)
      return convertCode((org.hl7.fhir.dstu3.model.CodeType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.DateType)
      return convertDate((org.hl7.fhir.dstu3.model.DateType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.DateTimeType)
      return convertDateTime((org.hl7.fhir.dstu3.model.DateTimeType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.DecimalType)
      return convertDecimal((org.hl7.fhir.dstu3.model.DecimalType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.IdType)
      return convertId((org.hl7.fhir.dstu3.model.IdType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.InstantType)
      return convertInstant((org.hl7.fhir.dstu3.model.InstantType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.IntegerType)
      return convertInteger((org.hl7.fhir.dstu3.model.IntegerType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.MarkdownType)
      return convertMarkdown((org.hl7.fhir.dstu3.model.MarkdownType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.OidType)
      return convertOid((org.hl7.fhir.dstu3.model.OidType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.PositiveIntType)
      return convertPositiveInt((org.hl7.fhir.dstu3.model.PositiveIntType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.StringType)
      return convertString((org.hl7.fhir.dstu3.model.StringType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.TimeType)
      return convertTime((org.hl7.fhir.dstu3.model.TimeType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.UnsignedIntType)
      return convertUnsignedInt((org.hl7.fhir.dstu3.model.UnsignedIntType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.UriType)
      return convertUri((org.hl7.fhir.dstu3.model.UriType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.UuidType)
      return convertUuid((org.hl7.fhir.dstu3.model.UuidType) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Extension)
      return convertExtension((org.hl7.fhir.dstu3.model.Extension) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Narrative)
      return convertNarrative((org.hl7.fhir.dstu3.model.Narrative) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Age)
      return convertAge((org.hl7.fhir.dstu3.model.Age) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Annotation)
      return convertAnnotation((org.hl7.fhir.dstu3.model.Annotation) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Attachment)
      return convertAttachment((org.hl7.fhir.dstu3.model.Attachment) src);
    if (src instanceof org.hl7.fhir.dstu3.model.CodeableConcept)
      return convertCodeableConcept((org.hl7.fhir.dstu3.model.CodeableConcept) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Coding)
      return convertCoding((org.hl7.fhir.dstu3.model.Coding) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Count)
      return convertCount((org.hl7.fhir.dstu3.model.Count) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Distance)
      return convertDistance((org.hl7.fhir.dstu3.model.Distance) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Duration)
      return convertDuration((org.hl7.fhir.dstu3.model.Duration) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Identifier)
      return convertIdentifier((org.hl7.fhir.dstu3.model.Identifier) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Money)
      return convertMoney((org.hl7.fhir.dstu3.model.Money) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Period)
      return convertPeriod((org.hl7.fhir.dstu3.model.Period) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Quantity)
      return convertQuantity((org.hl7.fhir.dstu3.model.Quantity) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Range)
      return convertRange((org.hl7.fhir.dstu3.model.Range) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Ratio)
      return convertRatio((org.hl7.fhir.dstu3.model.Ratio) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Reference)
      return convertReference((org.hl7.fhir.dstu3.model.Reference) src);
    if (src instanceof org.hl7.fhir.dstu3.model.SampledData)
      return convertSampledData((org.hl7.fhir.dstu3.model.SampledData) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Signature)
      return convertSignature((org.hl7.fhir.dstu3.model.Signature) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Address)
      return convertAddress((org.hl7.fhir.dstu3.model.Address) src);
    if (src instanceof org.hl7.fhir.dstu3.model.ContactPoint)
      return convertContactPoint((org.hl7.fhir.dstu3.model.ContactPoint) src);
    if (src instanceof org.hl7.fhir.dstu3.model.ElementDefinition)
      return convertElementDefinition((org.hl7.fhir.dstu3.model.ElementDefinition) src);
    if (src instanceof org.hl7.fhir.dstu3.model.HumanName)
      return convertHumanName((org.hl7.fhir.dstu3.model.HumanName) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Meta)
      return convertMeta((org.hl7.fhir.dstu3.model.Meta) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Timing)
      return convertTiming((org.hl7.fhir.dstu3.model.Timing) src);
    throw new Error("Unknown type "+src.fhirType());
  }

  private static void copyDomainResource(org.hl7.fhir.dstu2016may.model.DomainResource src, org.hl7.fhir.dstu3.model.DomainResource tgt) throws FHIRException {
    copyResource(src, tgt);
    tgt.setText(convertNarrative(src.getText()));
    for (org.hl7.fhir.dstu2016may.model.Resource t : src.getContained())
      tgt.addContained(convertResource(t));
    for (org.hl7.fhir.dstu2016may.model.Extension t : src.getExtension())
      tgt.addExtension(convertExtension(t));
    for (org.hl7.fhir.dstu2016may.model.Extension t : src.getModifierExtension())
      tgt.addModifierExtension(convertExtension(t));
  }
  private static void copyDomainResource(org.hl7.fhir.dstu3.model.DomainResource src, org.hl7.fhir.dstu2016may.model.DomainResource tgt) throws FHIRException {
    copyResource(src, tgt);
    tgt.setText(convertNarrative(src.getText()));
    for (org.hl7.fhir.dstu3.model.Resource t : src.getContained())
      tgt.addContained(convertResource(t));
    for (org.hl7.fhir.dstu3.model.Extension t : src.getExtension())
      tgt.addExtension(convertExtension(t));
    for (org.hl7.fhir.dstu3.model.Extension t : src.getModifierExtension())
      tgt.addModifierExtension(convertExtension(t));
  }
  public static org.hl7.fhir.dstu3.model.Parameters convertParameters(org.hl7.fhir.dstu2016may.model.Parameters src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Parameters tgt = new org.hl7.fhir.dstu3.model.Parameters();
    copyResource(src, tgt);
    for (org.hl7.fhir.dstu2016may.model.Parameters.ParametersParameterComponent t : src.getParameter())
      tgt.addParameter(convertParametersParameterComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Parameters convertParameters(org.hl7.fhir.dstu3.model.Parameters src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Parameters tgt = new org.hl7.fhir.dstu2016may.model.Parameters();
    copyResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Parameters.ParametersParameterComponent t : src.getParameter())
      tgt.addParameter(convertParametersParameterComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Parameters.ParametersParameterComponent convertParametersParameterComponent(org.hl7.fhir.dstu2016may.model.Parameters.ParametersParameterComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Parameters.ParametersParameterComponent tgt = new org.hl7.fhir.dstu3.model.Parameters.ParametersParameterComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setValue(convertType(src.getValue()));
    tgt.setResource(convertResource(src.getResource()));
    for (org.hl7.fhir.dstu2016may.model.Parameters.ParametersParameterComponent t : src.getPart())
      tgt.addPart(convertParametersParameterComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Parameters.ParametersParameterComponent convertParametersParameterComponent(org.hl7.fhir.dstu3.model.Parameters.ParametersParameterComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Parameters.ParametersParameterComponent tgt = new org.hl7.fhir.dstu2016may.model.Parameters.ParametersParameterComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setValue(convertType(src.getValue()));
    tgt.setResource(convertResource(src.getResource()));
    for (org.hl7.fhir.dstu3.model.Parameters.ParametersParameterComponent t : src.getPart())
      tgt.addPart(convertParametersParameterComponent(t));
    return tgt;
  }

  private static void copyResource(org.hl7.fhir.dstu2016may.model.Resource src, org.hl7.fhir.dstu3.model.Resource tgt) throws FHIRException {
    tgt.setId(src.getId());
    tgt.setMeta(convertMeta(src.getMeta()));
    tgt.setImplicitRules(src.getImplicitRules());
    tgt.setLanguage(src.getLanguage());
  }
  private static void copyResource(org.hl7.fhir.dstu3.model.Resource src, org.hl7.fhir.dstu2016may.model.Resource tgt) throws FHIRException {
    tgt.setId(src.getId());
    tgt.setMeta(convertMeta(src.getMeta()));
    tgt.setImplicitRules(src.getImplicitRules());
    tgt.setLanguage(src.getLanguage());
  }

  public static org.hl7.fhir.dstu3.model.Binary convertBinary(org.hl7.fhir.dstu2016may.model.Binary src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Binary tgt = new org.hl7.fhir.dstu3.model.Binary();
    copyResource(src, tgt);
    tgt.setContentType(src.getContentType());
    tgt.setContent(src.getContent());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Binary convertBinary(org.hl7.fhir.dstu3.model.Binary src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Binary tgt = new org.hl7.fhir.dstu2016may.model.Binary();
    copyResource(src, tgt);
    tgt.setContentType(src.getContentType());
    tgt.setContent(src.getContent());
    return tgt;
  }


  public static org.hl7.fhir.dstu3.model.Bundle convertBundle(org.hl7.fhir.dstu2016may.model.Bundle src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Bundle tgt = new org.hl7.fhir.dstu3.model.Bundle();
    copyResource(src, tgt);
    tgt.setType(convertBundleType(src.getType()));
    tgt.setTotal(src.getTotal());
    for (org.hl7.fhir.dstu2016may.model.Bundle.BundleLinkComponent t : src.getLink())
      tgt.addLink(convertBundleLinkComponent(t));
    for (org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryComponent t : src.getEntry())
      tgt.addEntry(convertBundleEntryComponent(t));
    tgt.setSignature(convertSignature(src.getSignature()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Bundle convertBundle(org.hl7.fhir.dstu3.model.Bundle src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Bundle tgt = new org.hl7.fhir.dstu2016may.model.Bundle();
    copyResource(src, tgt);
    tgt.setType(convertBundleType(src.getType()));
    tgt.setTotal(src.getTotal());
    for (org.hl7.fhir.dstu3.model.Bundle.BundleLinkComponent t : src.getLink())
      tgt.addLink(convertBundleLinkComponent(t));
    for (org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent t : src.getEntry())
      tgt.addEntry(convertBundleEntryComponent(t));
    tgt.setSignature(convertSignature(src.getSignature()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Bundle.BundleType convertBundleType(org.hl7.fhir.dstu2016may.model.Bundle.BundleType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case DOCUMENT: return org.hl7.fhir.dstu3.model.Bundle.BundleType.DOCUMENT;
    case MESSAGE: return org.hl7.fhir.dstu3.model.Bundle.BundleType.MESSAGE;
    case TRANSACTION: return org.hl7.fhir.dstu3.model.Bundle.BundleType.TRANSACTION;
    case TRANSACTIONRESPONSE: return org.hl7.fhir.dstu3.model.Bundle.BundleType.TRANSACTIONRESPONSE;
    case BATCH: return org.hl7.fhir.dstu3.model.Bundle.BundleType.BATCH;
    case BATCHRESPONSE: return org.hl7.fhir.dstu3.model.Bundle.BundleType.BATCHRESPONSE;
    case HISTORY: return org.hl7.fhir.dstu3.model.Bundle.BundleType.HISTORY;
    case SEARCHSET: return org.hl7.fhir.dstu3.model.Bundle.BundleType.SEARCHSET;
    case COLLECTION: return org.hl7.fhir.dstu3.model.Bundle.BundleType.COLLECTION;
    default: return org.hl7.fhir.dstu3.model.Bundle.BundleType.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Bundle.BundleType convertBundleType(org.hl7.fhir.dstu3.model.Bundle.BundleType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case DOCUMENT: return org.hl7.fhir.dstu2016may.model.Bundle.BundleType.DOCUMENT;
    case MESSAGE: return org.hl7.fhir.dstu2016may.model.Bundle.BundleType.MESSAGE;
    case TRANSACTION: return org.hl7.fhir.dstu2016may.model.Bundle.BundleType.TRANSACTION;
    case TRANSACTIONRESPONSE: return org.hl7.fhir.dstu2016may.model.Bundle.BundleType.TRANSACTIONRESPONSE;
    case BATCH: return org.hl7.fhir.dstu2016may.model.Bundle.BundleType.BATCH;
    case BATCHRESPONSE: return org.hl7.fhir.dstu2016may.model.Bundle.BundleType.BATCHRESPONSE;
    case HISTORY: return org.hl7.fhir.dstu2016may.model.Bundle.BundleType.HISTORY;
    case SEARCHSET: return org.hl7.fhir.dstu2016may.model.Bundle.BundleType.SEARCHSET;
    case COLLECTION: return org.hl7.fhir.dstu2016may.model.Bundle.BundleType.COLLECTION;
    default: return org.hl7.fhir.dstu2016may.model.Bundle.BundleType.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.Bundle.BundleLinkComponent convertBundleLinkComponent(org.hl7.fhir.dstu2016may.model.Bundle.BundleLinkComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Bundle.BundleLinkComponent tgt = new org.hl7.fhir.dstu3.model.Bundle.BundleLinkComponent();
    copyElement(src, tgt);
    tgt.setRelation(src.getRelation());
    tgt.setUrl(src.getUrl());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Bundle.BundleLinkComponent convertBundleLinkComponent(org.hl7.fhir.dstu3.model.Bundle.BundleLinkComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Bundle.BundleLinkComponent tgt = new org.hl7.fhir.dstu2016may.model.Bundle.BundleLinkComponent();
    copyElement(src, tgt);
    tgt.setRelation(src.getRelation());
    tgt.setUrl(src.getUrl());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent convertBundleEntryComponent(org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent tgt = new org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2016may.model.Bundle.BundleLinkComponent t : src.getLink())
      tgt.addLink(convertBundleLinkComponent(t));
    tgt.setFullUrl(src.getFullUrl());
    tgt.setResource(convertResource(src.getResource()));
    tgt.setSearch(convertBundleEntrySearchComponent(src.getSearch()));
    tgt.setRequest(convertBundleEntryRequestComponent(src.getRequest()));
    tgt.setResponse(convertBundleEntryResponseComponent(src.getResponse()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryComponent convertBundleEntryComponent(org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryComponent tgt = new org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.Bundle.BundleLinkComponent t : src.getLink())
      tgt.addLink(convertBundleLinkComponent(t));
    tgt.setFullUrl(src.getFullUrl());
    tgt.setResource(convertResource(src.getResource()));
    tgt.setSearch(convertBundleEntrySearchComponent(src.getSearch()));
    tgt.setRequest(convertBundleEntryRequestComponent(src.getRequest()));
    tgt.setResponse(convertBundleEntryResponseComponent(src.getResponse()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Bundle.BundleEntrySearchComponent convertBundleEntrySearchComponent(org.hl7.fhir.dstu2016may.model.Bundle.BundleEntrySearchComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Bundle.BundleEntrySearchComponent tgt = new org.hl7.fhir.dstu3.model.Bundle.BundleEntrySearchComponent();
    copyElement(src, tgt);
    tgt.setMode(convertSearchEntryMode(src.getMode()));
    tgt.setScore(src.getScore());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Bundle.BundleEntrySearchComponent convertBundleEntrySearchComponent(org.hl7.fhir.dstu3.model.Bundle.BundleEntrySearchComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Bundle.BundleEntrySearchComponent tgt = new org.hl7.fhir.dstu2016may.model.Bundle.BundleEntrySearchComponent();
    copyElement(src, tgt);
    tgt.setMode(convertSearchEntryMode(src.getMode()));
    tgt.setScore(src.getScore());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Bundle.SearchEntryMode convertSearchEntryMode(org.hl7.fhir.dstu2016may.model.Bundle.SearchEntryMode src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case MATCH: return org.hl7.fhir.dstu3.model.Bundle.SearchEntryMode.MATCH;
    case INCLUDE: return org.hl7.fhir.dstu3.model.Bundle.SearchEntryMode.INCLUDE;
    case OUTCOME: return org.hl7.fhir.dstu3.model.Bundle.SearchEntryMode.OUTCOME;
    default: return org.hl7.fhir.dstu3.model.Bundle.SearchEntryMode.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Bundle.SearchEntryMode convertSearchEntryMode(org.hl7.fhir.dstu3.model.Bundle.SearchEntryMode src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case MATCH: return org.hl7.fhir.dstu2016may.model.Bundle.SearchEntryMode.MATCH;
    case INCLUDE: return org.hl7.fhir.dstu2016may.model.Bundle.SearchEntryMode.INCLUDE;
    case OUTCOME: return org.hl7.fhir.dstu2016may.model.Bundle.SearchEntryMode.OUTCOME;
    default: return org.hl7.fhir.dstu2016may.model.Bundle.SearchEntryMode.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.Bundle.BundleEntryRequestComponent convertBundleEntryRequestComponent(org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryRequestComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Bundle.BundleEntryRequestComponent tgt = new org.hl7.fhir.dstu3.model.Bundle.BundleEntryRequestComponent();
    copyElement(src, tgt);
    tgt.setMethod(convertHTTPVerb(src.getMethod()));
    tgt.setUrl(src.getUrl());
    tgt.setIfNoneMatch(src.getIfNoneMatch());
    tgt.setIfModifiedSince(src.getIfModifiedSince());
    tgt.setIfMatch(src.getIfMatch());
    tgt.setIfNoneExist(src.getIfNoneExist());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryRequestComponent convertBundleEntryRequestComponent(org.hl7.fhir.dstu3.model.Bundle.BundleEntryRequestComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryRequestComponent tgt = new org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryRequestComponent();
    copyElement(src, tgt);
    tgt.setMethod(convertHTTPVerb(src.getMethod()));
    tgt.setUrl(src.getUrl());
    tgt.setIfNoneMatch(src.getIfNoneMatch());
    tgt.setIfModifiedSince(src.getIfModifiedSince());
    tgt.setIfMatch(src.getIfMatch());
    tgt.setIfNoneExist(src.getIfNoneExist());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Bundle.HTTPVerb convertHTTPVerb(org.hl7.fhir.dstu2016may.model.Bundle.HTTPVerb src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case GET: return org.hl7.fhir.dstu3.model.Bundle.HTTPVerb.GET;
    case POST: return org.hl7.fhir.dstu3.model.Bundle.HTTPVerb.POST;
    case PUT: return org.hl7.fhir.dstu3.model.Bundle.HTTPVerb.PUT;
    case DELETE: return org.hl7.fhir.dstu3.model.Bundle.HTTPVerb.DELETE;
    default: return org.hl7.fhir.dstu3.model.Bundle.HTTPVerb.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Bundle.HTTPVerb convertHTTPVerb(org.hl7.fhir.dstu3.model.Bundle.HTTPVerb src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case GET: return org.hl7.fhir.dstu2016may.model.Bundle.HTTPVerb.GET;
    case POST: return org.hl7.fhir.dstu2016may.model.Bundle.HTTPVerb.POST;
    case PUT: return org.hl7.fhir.dstu2016may.model.Bundle.HTTPVerb.PUT;
    case DELETE: return org.hl7.fhir.dstu2016may.model.Bundle.HTTPVerb.DELETE;
    default: return org.hl7.fhir.dstu2016may.model.Bundle.HTTPVerb.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.Bundle.BundleEntryResponseComponent convertBundleEntryResponseComponent(org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryResponseComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Bundle.BundleEntryResponseComponent tgt = new org.hl7.fhir.dstu3.model.Bundle.BundleEntryResponseComponent();
    copyElement(src, tgt);
    tgt.setStatus(src.getStatus());
    tgt.setLocation(src.getLocation());
    tgt.setEtag(src.getEtag());
    tgt.setLastModified(src.getLastModified());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryResponseComponent convertBundleEntryResponseComponent(org.hl7.fhir.dstu3.model.Bundle.BundleEntryResponseComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryResponseComponent tgt = new org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryResponseComponent();
    copyElement(src, tgt);
    tgt.setStatus(src.getStatus());
    tgt.setLocation(src.getLocation());
    tgt.setEtag(src.getEtag());
    tgt.setLastModified(src.getLastModified());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Enumerations.ConformanceResourceStatus convertConformanceResourceStatus(org.hl7.fhir.dstu2016may.model.Enumerations.ConformanceResourceStatus src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case DRAFT: return org.hl7.fhir.dstu3.model.Enumerations.ConformanceResourceStatus.DRAFT;
    case ACTIVE: return org.hl7.fhir.dstu3.model.Enumerations.ConformanceResourceStatus.ACTIVE;
    case RETIRED: return org.hl7.fhir.dstu3.model.Enumerations.ConformanceResourceStatus.RETIRED;
    default: return org.hl7.fhir.dstu3.model.Enumerations.ConformanceResourceStatus.NULL;
    }
  }

  public static org.hl7.fhir.dstu2016may.model.Enumerations.ConformanceResourceStatus convertConformanceResourceStatus(org.hl7.fhir.dstu3.model.Enumerations.ConformanceResourceStatus src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case DRAFT: return org.hl7.fhir.dstu2016may.model.Enumerations.ConformanceResourceStatus.DRAFT;
    case ACTIVE: return org.hl7.fhir.dstu2016may.model.Enumerations.ConformanceResourceStatus.ACTIVE;
    case RETIRED: return org.hl7.fhir.dstu2016may.model.Enumerations.ConformanceResourceStatus.RETIRED;
    default: return org.hl7.fhir.dstu2016may.model.Enumerations.ConformanceResourceStatus.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.CodeSystem convertCodeSystem(org.hl7.fhir.dstu2016may.model.CodeSystem src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.CodeSystem tgt = new org.hl7.fhir.dstu3.model.CodeSystem();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContactComponent t : src.getContact())
      tgt.addContact(convertCodeSystemContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2016may.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setCopyright(src.getCopyright());
    tgt.setCaseSensitive(src.getCaseSensitive());
    tgt.setValueSet(src.getValueSet());
    tgt.setCompositional(src.getCompositional());
    tgt.setVersionNeeded(src.getVersionNeeded());
    tgt.setContent(convertCodeSystemContentMode(src.getContent()));
    tgt.setCount(src.getCount());
    for (org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemFilterComponent t : src.getFilter())
      tgt.addFilter(convertCodeSystemFilterComponent(t));
    for (org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemPropertyComponent t : src.getProperty())
      tgt.addProperty(convertPropertyComponent(t));
    for (org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionComponent t : src.getConcept())
      tgt.addConcept(convertConceptDefinitionComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.CodeSystem convertCodeSystem(org.hl7.fhir.dstu3.model.CodeSystem src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.CodeSystem tgt = new org.hl7.fhir.dstu2016may.model.CodeSystem();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemContactComponent t : src.getContact())
      tgt.addContact(convertCodeSystemContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setCopyright(src.getCopyright());
    tgt.setCaseSensitive(src.getCaseSensitive());
    tgt.setValueSet(src.getValueSet());
    tgt.setCompositional(src.getCompositional());
    tgt.setVersionNeeded(src.getVersionNeeded());
    tgt.setContent(convertCodeSystemContentMode(src.getContent()));
    tgt.setCount(src.getCount());
    for (org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemFilterComponent t : src.getFilter())
      tgt.addFilter(convertCodeSystemFilterComponent(t));
    for (org.hl7.fhir.dstu3.model.CodeSystem.PropertyComponent t : src.getProperty())
      tgt.addProperty(convertPropertyComponent(t));
    for (org.hl7.fhir.dstu3.model.CodeSystem.ConceptDefinitionComponent t : src.getConcept())
      tgt.addConcept(convertConceptDefinitionComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemContentMode convertCodeSystemContentMode(org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContentMode src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case NOTPRESENT: return org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemContentMode.NOTPRESENT;
    case EXAMPLAR: return org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemContentMode.EXAMPLAR;
    case FRAGMENT: return org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemContentMode.FRAGMENT;
    case COMPLETE: return org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemContentMode.COMPLETE;
    default: return org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemContentMode.NULL;
  }
}

  private static org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContentMode convertCodeSystemContentMode(org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemContentMode src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case NOTPRESENT: return org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContentMode.NOTPRESENT;
    case EXAMPLAR: return org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContentMode.EXAMPLAR;
    case FRAGMENT: return org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContentMode.FRAGMENT;
    case COMPLETE: return org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContentMode.COMPLETE;
    default: return org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContentMode.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemContactComponent convertCodeSystemContactComponent(org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemContactComponent tgt = new org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2016may.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContactComponent convertCodeSystemContactComponent(org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContactComponent tgt = new org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemFilterComponent convertCodeSystemFilterComponent(org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemFilterComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemFilterComponent tgt = new org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemFilterComponent();
    copyElement(src, tgt);
    tgt.setCode(src.getCode());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2016may.model.CodeType t : src.getOperator())
      try {
        tgt.addOperator(CodeSystem.FilterOperator.fromCode(t.getValue()));
      } catch (org.hl7.fhir.dstu3.exceptions.FHIRException e) {
        throw new FHIRException(e);
      }
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemFilterComponent convertCodeSystemFilterComponent(org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemFilterComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemFilterComponent tgt = new org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemFilterComponent();
    copyElement(src, tgt);
    tgt.setCode(src.getCode());
    tgt.setDescription(src.getDescription());
    for (Enumeration<FilterOperator> t : src.getOperator())
      tgt.addOperator(t.getValue().toCode());
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.CodeSystem.PropertyComponent convertPropertyComponent(org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemPropertyComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.CodeSystem.PropertyComponent tgt = new org.hl7.fhir.dstu3.model.CodeSystem.PropertyComponent();
    copyElement(src, tgt);
    tgt.setCode(src.getCode());
    tgt.setDescription(src.getDescription());
    tgt.setType(convertPropertyType(src.getType()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemPropertyComponent convertPropertyComponent(org.hl7.fhir.dstu3.model.CodeSystem.PropertyComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemPropertyComponent tgt = new org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemPropertyComponent();
    copyElement(src, tgt);
    tgt.setCode(src.getCode());
    tgt.setDescription(src.getDescription());
    tgt.setType(convertPropertyType(src.getType()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.CodeSystem.PropertyType convertPropertyType(org.hl7.fhir.dstu2016may.model.CodeSystem.PropertyType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case CODE: return org.hl7.fhir.dstu3.model.CodeSystem.PropertyType.CODE;
    case CODING: return org.hl7.fhir.dstu3.model.CodeSystem.PropertyType.CODING;
    case STRING: return org.hl7.fhir.dstu3.model.CodeSystem.PropertyType.STRING;
    case INTEGER: return org.hl7.fhir.dstu3.model.CodeSystem.PropertyType.INTEGER;
    case BOOLEAN: return org.hl7.fhir.dstu3.model.CodeSystem.PropertyType.BOOLEAN;
    case DATETIME: return org.hl7.fhir.dstu3.model.CodeSystem.PropertyType.DATETIME;
    default: return org.hl7.fhir.dstu3.model.CodeSystem.PropertyType.NULL;
  }
}

  private static org.hl7.fhir.dstu2016may.model.CodeSystem.PropertyType convertPropertyType(org.hl7.fhir.dstu3.model.CodeSystem.PropertyType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case CODE: return org.hl7.fhir.dstu2016may.model.CodeSystem.PropertyType.CODE;
    case CODING: return org.hl7.fhir.dstu2016may.model.CodeSystem.PropertyType.CODING;
    case STRING: return org.hl7.fhir.dstu2016may.model.CodeSystem.PropertyType.STRING;
    case INTEGER: return org.hl7.fhir.dstu2016may.model.CodeSystem.PropertyType.INTEGER;
    case BOOLEAN: return org.hl7.fhir.dstu2016may.model.CodeSystem.PropertyType.BOOLEAN;
    case DATETIME: return org.hl7.fhir.dstu2016may.model.CodeSystem.PropertyType.DATETIME;
    default: return org.hl7.fhir.dstu2016may.model.CodeSystem.PropertyType.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.CodeSystem.ConceptDefinitionComponent convertConceptDefinitionComponent(org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.CodeSystem.ConceptDefinitionComponent tgt = new org.hl7.fhir.dstu3.model.CodeSystem.ConceptDefinitionComponent();
    copyElement(src, tgt);
    tgt.setCode(src.getCode());
    tgt.setDisplay(src.getDisplay());
    tgt.setDefinition(src.getDefinition());
    for (org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionDesignationComponent t : src.getDesignation())
      tgt.addDesignation(convertConceptDefinitionDesignationComponent(t));
    for (ConceptDefinitionPropertyComponent t : src.getProperty())
      tgt.addProperty(convertConceptPropertyComponent(t));
    for (org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionComponent t : src.getConcept())
      tgt.addConcept(convertConceptDefinitionComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionComponent convertConceptDefinitionComponent(org.hl7.fhir.dstu3.model.CodeSystem.ConceptDefinitionComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionComponent tgt = new org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionComponent();
    copyElement(src, tgt);
    tgt.setCode(src.getCode());
    tgt.setDisplay(src.getDisplay());
    tgt.setDefinition(src.getDefinition());
    for (org.hl7.fhir.dstu3.model.CodeSystem.ConceptDefinitionDesignationComponent t : src.getDesignation())
      tgt.addDesignation(convertConceptDefinitionDesignationComponent(t));
    for (org.hl7.fhir.dstu3.model.CodeSystem.ConceptPropertyComponent t : src.getProperty())
      tgt.addProperty(convertConceptPropertyComponent(t));
    for (org.hl7.fhir.dstu3.model.CodeSystem.ConceptDefinitionComponent t : src.getConcept())
      tgt.addConcept(convertConceptDefinitionComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.CodeSystem.ConceptDefinitionDesignationComponent convertConceptDefinitionDesignationComponent(org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionDesignationComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.CodeSystem.ConceptDefinitionDesignationComponent tgt = new org.hl7.fhir.dstu3.model.CodeSystem.ConceptDefinitionDesignationComponent();
    copyElement(src, tgt);
    tgt.setLanguage(src.getLanguage());
    tgt.setUse(convertCoding(src.getUse()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionDesignationComponent convertConceptDefinitionDesignationComponent(org.hl7.fhir.dstu3.model.CodeSystem.ConceptDefinitionDesignationComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionDesignationComponent tgt = new org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionDesignationComponent();
    copyElement(src, tgt);
    tgt.setLanguage(src.getLanguage());
    tgt.setUse(convertCoding(src.getUse()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.CodeSystem.ConceptPropertyComponent convertConceptPropertyComponent(org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionPropertyComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.CodeSystem.ConceptPropertyComponent tgt = new org.hl7.fhir.dstu3.model.CodeSystem.ConceptPropertyComponent();
    copyElement(src, tgt);
    tgt.setCode(src.getCode());
    tgt.setValue(convertType(src.getValue()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionPropertyComponent convertConceptPropertyComponent(org.hl7.fhir.dstu3.model.CodeSystem.ConceptPropertyComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionPropertyComponent tgt = new org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionPropertyComponent();
    copyElement(src, tgt);
    tgt.setCode(src.getCode());
    tgt.setValue(convertType(src.getValue()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.CompartmentDefinition convertCompartmentDefinition(org.hl7.fhir.dstu2016may.model.CompartmentDefinition src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.CompartmentDefinition tgt = new org.hl7.fhir.dstu3.model.CompartmentDefinition();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionContactComponent t : src.getContact())
      tgt.addContact(convertCompartmentDefinitionContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setDescription(src.getDescription());
    tgt.setRequirements(src.getRequirements());
    tgt.setCode(convertCompartmentType(src.getCode()));
    tgt.setSearch(src.getSearch());
    for (org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionResourceComponent t : src.getResource())
      tgt.addResource(convertCompartmentDefinitionResourceComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.CompartmentDefinition convertCompartmentDefinition(org.hl7.fhir.dstu3.model.CompartmentDefinition src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.CompartmentDefinition tgt = new org.hl7.fhir.dstu2016may.model.CompartmentDefinition();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentDefinitionContactComponent t : src.getContact())
      tgt.addContact(convertCompartmentDefinitionContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setDescription(src.getDescription());
    tgt.setRequirements(src.getRequirements());
    tgt.setCode(convertCompartmentType(src.getCode()));
    tgt.setSearch(src.getSearch());
    for (org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentDefinitionResourceComponent t : src.getResource())
      tgt.addResource(convertCompartmentDefinitionResourceComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentType convertCompartmentType(org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case PATIENT: return org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentType.PATIENT;
    case ENCOUNTER: return org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentType.ENCOUNTER;
    case RELATEDPERSON: return org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentType.RELATEDPERSON;
    case PRACTITIONER: return org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentType.PRACTITIONER;
    case DEVICE: return org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentType.DEVICE;
    default: return org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentType.NULL;
  }
}

  private static org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType convertCompartmentType(org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case PATIENT: return org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.PATIENT;
    case ENCOUNTER: return org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.ENCOUNTER;
    case RELATEDPERSON: return org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.RELATEDPERSON;
    case PRACTITIONER: return org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.PRACTITIONER;
    case DEVICE: return org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.DEVICE;
    default: return org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.NULL;
  }
}

  public static org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentDefinitionContactComponent convertCompartmentDefinitionContactComponent(org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentDefinitionContactComponent tgt = new org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentDefinitionContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2016may.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionContactComponent convertCompartmentDefinitionContactComponent(org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentDefinitionContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionContactComponent tgt = new org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentDefinitionResourceComponent convertCompartmentDefinitionResourceComponent(org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionResourceComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentDefinitionResourceComponent tgt = new org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentDefinitionResourceComponent();
    copyElement(src, tgt);
    tgt.setCode(src.getCode());
    for (org.hl7.fhir.dstu2016may.model.StringType t : src.getParam())
      tgt.addParam(t.getValue());
    tgt.setDocumentation(src.getDocumentation());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionResourceComponent convertCompartmentDefinitionResourceComponent(org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentDefinitionResourceComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionResourceComponent tgt = new org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionResourceComponent();
    copyElement(src, tgt);
    tgt.setCode(src.getCode());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getParam())
      tgt.addParam(t.getValue());
    tgt.setDocumentation(src.getDocumentation());
    return tgt;
  }


  public static org.hl7.fhir.dstu3.model.ConceptMap convertConceptMap(org.hl7.fhir.dstu2016may.model.ConceptMap src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ConceptMap tgt = new org.hl7.fhir.dstu3.model.ConceptMap();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu2016may.model.ConceptMap.ConceptMapContactComponent t : src.getContact())
      tgt.addContact(convertConceptMapContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2016may.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setCopyright(src.getCopyright());
    tgt.setSource(convertType(src.getSource()));
    tgt.setTarget(convertType(src.getTarget()));
    for (org.hl7.fhir.dstu2016may.model.ConceptMap.SourceElementComponent t : src.getElement()) {
      List<SourceElementComponentWrapper> ws = convertSourceElementComponent(t);
      for (SourceElementComponentWrapper w : ws)
      getGroup(tgt, w.source, w.target).addElement(w.comp);
    }
    return tgt;
  }

  private static ConceptMapGroupComponent getGroup(ConceptMap map, String srcs, String tgts) {
    for (ConceptMapGroupComponent grp : map.getGroup()) {
      if (grp.getSource().equals(srcs) && grp.getTarget().equals(tgts))
        return grp;
    }
    ConceptMapGroupComponent grp = map.addGroup();
    grp.setSource(srcs);
    grp.setTarget(tgts);
    return grp;
  }


  public static org.hl7.fhir.dstu2016may.model.ConceptMap convertConceptMap(org.hl7.fhir.dstu3.model.ConceptMap src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ConceptMap tgt = new org.hl7.fhir.dstu2016may.model.ConceptMap();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapContactComponent t : src.getContact())
      tgt.addContact(convertConceptMapContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setCopyright(src.getCopyright());
    tgt.setSource(convertType(src.getSource()));
    tgt.setTarget(convertType(src.getTarget()));
    for (org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapGroupComponent g : src.getGroup())
      for (org.hl7.fhir.dstu3.model.ConceptMap.SourceElementComponent t : g.getElement())
        tgt.addElement(convertSourceElementComponent(t, g));
    return tgt;
  }


  public static org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapContactComponent convertConceptMapContactComponent(org.hl7.fhir.dstu2016may.model.ConceptMap.ConceptMapContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapContactComponent tgt = new org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2016may.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ConceptMap.ConceptMapContactComponent convertConceptMapContactComponent(org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ConceptMap.ConceptMapContactComponent tgt = new org.hl7.fhir.dstu2016may.model.ConceptMap.ConceptMapContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  private static class SourceElementComponentWrapper {
    public SourceElementComponentWrapper(SourceElementComponent comp, String source, String target) {
      super();
      this.source = source;
      this.target = target;
      this.comp = comp;
    }
    private String source;
    private String target;
    private org.hl7.fhir.dstu3.model.ConceptMap.SourceElementComponent comp;

  }
  public static List<SourceElementComponentWrapper> convertSourceElementComponent(org.hl7.fhir.dstu2016may.model.ConceptMap.SourceElementComponent src) throws FHIRException {
    List<SourceElementComponentWrapper> res = new ArrayList<SourceElementComponentWrapper>();
    if (src == null || src.isEmpty())
      return res;
    for (org.hl7.fhir.dstu2016may.model.ConceptMap.TargetElementComponent t : src.getTarget()) {
      org.hl7.fhir.dstu3.model.ConceptMap.SourceElementComponent tgt = new org.hl7.fhir.dstu3.model.ConceptMap.SourceElementComponent();
      copyElement(src, tgt);
      tgt.setCode(src.getCode());
      tgt.addTarget(convertTargetElementComponent(t));
      res.add(new SourceElementComponentWrapper(tgt, src.getSystem(), t.getSystem()));
    }
    return res;
  }

  public static org.hl7.fhir.dstu2016may.model.ConceptMap.SourceElementComponent convertSourceElementComponent(org.hl7.fhir.dstu3.model.ConceptMap.SourceElementComponent src, org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapGroupComponent g) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ConceptMap.SourceElementComponent tgt = new org.hl7.fhir.dstu2016may.model.ConceptMap.SourceElementComponent();
    copyElement(src, tgt);
    tgt.setSystem(g.getSource());
    tgt.setCode(src.getCode());
    for (org.hl7.fhir.dstu3.model.ConceptMap.TargetElementComponent t : src.getTarget())
      tgt.addTarget(convertTargetElementComponent(t, g));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ConceptMap.TargetElementComponent convertTargetElementComponent(org.hl7.fhir.dstu2016may.model.ConceptMap.TargetElementComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ConceptMap.TargetElementComponent tgt = new org.hl7.fhir.dstu3.model.ConceptMap.TargetElementComponent();
    copyElement(src, tgt);
    tgt.setCode(src.getCode());
    tgt.setEquivalence(convertConceptMapEquivalence(src.getEquivalence()));
    tgt.setComments(src.getComments());
    for (org.hl7.fhir.dstu2016may.model.ConceptMap.OtherElementComponent t : src.getDependsOn())
      tgt.addDependsOn(convertOtherElementComponent(t));
    for (org.hl7.fhir.dstu2016may.model.ConceptMap.OtherElementComponent t : src.getProduct())
      tgt.addProduct(convertOtherElementComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ConceptMap.TargetElementComponent convertTargetElementComponent(org.hl7.fhir.dstu3.model.ConceptMap.TargetElementComponent src, org.hl7.fhir.dstu3.model.ConceptMap.ConceptMapGroupComponent g) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ConceptMap.TargetElementComponent tgt = new org.hl7.fhir.dstu2016may.model.ConceptMap.TargetElementComponent();
    copyElement(src, tgt);
    tgt.setSystem(g.getTarget());
    tgt.setCode(src.getCode());
    tgt.setEquivalence(convertConceptMapEquivalence(src.getEquivalence()));
    tgt.setComments(src.getComments());
    for (org.hl7.fhir.dstu3.model.ConceptMap.OtherElementComponent t : src.getDependsOn())
      tgt.addDependsOn(convertOtherElementComponent(t));
    for (org.hl7.fhir.dstu3.model.ConceptMap.OtherElementComponent t : src.getProduct())
      tgt.addProduct(convertOtherElementComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Enumerations.ConceptMapEquivalence convertConceptMapEquivalence(org.hl7.fhir.dstu2016may.model.Enumerations.ConceptMapEquivalence src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case EQUIVALENT: return org.hl7.fhir.dstu3.model.Enumerations.ConceptMapEquivalence.EQUIVALENT;
    case EQUAL: return org.hl7.fhir.dstu3.model.Enumerations.ConceptMapEquivalence.EQUAL;
    case WIDER: return org.hl7.fhir.dstu3.model.Enumerations.ConceptMapEquivalence.WIDER;
    case SUBSUMES: return org.hl7.fhir.dstu3.model.Enumerations.ConceptMapEquivalence.SUBSUMES;
    case NARROWER: return org.hl7.fhir.dstu3.model.Enumerations.ConceptMapEquivalence.NARROWER;
    case SPECIALIZES: return org.hl7.fhir.dstu3.model.Enumerations.ConceptMapEquivalence.SPECIALIZES;
    case INEXACT: return org.hl7.fhir.dstu3.model.Enumerations.ConceptMapEquivalence.INEXACT;
    case UNMATCHED: return org.hl7.fhir.dstu3.model.Enumerations.ConceptMapEquivalence.UNMATCHED;
    case DISJOINT: return org.hl7.fhir.dstu3.model.Enumerations.ConceptMapEquivalence.DISJOINT;
    default: return org.hl7.fhir.dstu3.model.Enumerations.ConceptMapEquivalence.NULL;
    }
  }

  public static org.hl7.fhir.dstu2016may.model.Enumerations.ConceptMapEquivalence convertConceptMapEquivalence(org.hl7.fhir.dstu3.model.Enumerations.ConceptMapEquivalence src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case EQUIVALENT: return org.hl7.fhir.dstu2016may.model.Enumerations.ConceptMapEquivalence.EQUIVALENT;
    case EQUAL: return org.hl7.fhir.dstu2016may.model.Enumerations.ConceptMapEquivalence.EQUAL;
    case WIDER: return org.hl7.fhir.dstu2016may.model.Enumerations.ConceptMapEquivalence.WIDER;
    case SUBSUMES: return org.hl7.fhir.dstu2016may.model.Enumerations.ConceptMapEquivalence.SUBSUMES;
    case NARROWER: return org.hl7.fhir.dstu2016may.model.Enumerations.ConceptMapEquivalence.NARROWER;
    case SPECIALIZES: return org.hl7.fhir.dstu2016may.model.Enumerations.ConceptMapEquivalence.SPECIALIZES;
    case INEXACT: return org.hl7.fhir.dstu2016may.model.Enumerations.ConceptMapEquivalence.INEXACT;
    case UNMATCHED: return org.hl7.fhir.dstu2016may.model.Enumerations.ConceptMapEquivalence.UNMATCHED;
    case DISJOINT: return org.hl7.fhir.dstu2016may.model.Enumerations.ConceptMapEquivalence.DISJOINT;
    default: return org.hl7.fhir.dstu2016may.model.Enumerations.ConceptMapEquivalence.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.ConceptMap.OtherElementComponent convertOtherElementComponent(org.hl7.fhir.dstu2016may.model.ConceptMap.OtherElementComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ConceptMap.OtherElementComponent tgt = new org.hl7.fhir.dstu3.model.ConceptMap.OtherElementComponent();
    copyElement(src, tgt);
    tgt.setProperty(src.getElement());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ConceptMap.OtherElementComponent convertOtherElementComponent(org.hl7.fhir.dstu3.model.ConceptMap.OtherElementComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ConceptMap.OtherElementComponent tgt = new org.hl7.fhir.dstu2016may.model.ConceptMap.OtherElementComponent();
    copyElement(src, tgt);
    tgt.setElement(src.getProperty());
    tgt.setSystem(src.getSystem());
    tgt.setCode(src.getCode());
    return tgt;
  }


  public static org.hl7.fhir.dstu3.model.Conformance convertConformance(org.hl7.fhir.dstu2016may.model.Conformance src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Conformance tgt = new org.hl7.fhir.dstu3.model.Conformance();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setDate(src.getDate());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu2016may.model.Conformance.ConformanceContactComponent t : src.getContact())
      tgt.addContact(convertConformanceContactComponent(t));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2016may.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setCopyright(src.getCopyright());
    tgt.setKind(convertConformanceStatementKind(src.getKind()));
    tgt.setSoftware(convertConformanceSoftwareComponent(src.getSoftware()));
    tgt.setImplementation(convertConformanceImplementationComponent(src.getImplementation()));
    tgt.setFhirVersion(src.getFhirVersion());
    tgt.setAcceptUnknown(convertUnknownContentCode(src.getAcceptUnknown()));
    for (org.hl7.fhir.dstu2016may.model.CodeType t : src.getFormat())
      tgt.addFormat(t.getValue());
    for (org.hl7.fhir.dstu2016may.model.Reference t : src.getProfile())
      tgt.addProfile(convertReference(t));
    for (org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestComponent t : src.getRest())
      tgt.addRest(convertConformanceRestComponent(t));
    for (org.hl7.fhir.dstu2016may.model.Conformance.ConformanceMessagingComponent t : src.getMessaging())
      tgt.addMessaging(convertConformanceMessagingComponent(t));
    for (org.hl7.fhir.dstu2016may.model.Conformance.ConformanceDocumentComponent t : src.getDocument())
      tgt.addDocument(convertConformanceDocumentComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Conformance convertConformance(org.hl7.fhir.dstu3.model.Conformance src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Conformance tgt = new org.hl7.fhir.dstu2016may.model.Conformance();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setDate(src.getDate());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu3.model.Conformance.ConformanceContactComponent t : src.getContact())
      tgt.addContact(convertConformanceContactComponent(t));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setCopyright(src.getCopyright());
    tgt.setKind(convertConformanceStatementKind(src.getKind()));
    tgt.setSoftware(convertConformanceSoftwareComponent(src.getSoftware()));
    tgt.setImplementation(convertConformanceImplementationComponent(src.getImplementation()));
    tgt.setFhirVersion(src.getFhirVersion());
    tgt.setAcceptUnknown(convertUnknownContentCode(src.getAcceptUnknown()));
    for (org.hl7.fhir.dstu3.model.CodeType t : src.getFormat())
      tgt.addFormat(t.getValue());
    for (org.hl7.fhir.dstu3.model.Reference t : src.getProfile())
      tgt.addProfile(convertReference(t));
    for (org.hl7.fhir.dstu3.model.Conformance.ConformanceRestComponent t : src.getRest())
      tgt.addRest(convertConformanceRestComponent(t));
    for (org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingComponent t : src.getMessaging())
      tgt.addMessaging(convertConformanceMessagingComponent(t));
    for (org.hl7.fhir.dstu3.model.Conformance.ConformanceDocumentComponent t : src.getDocument())
      tgt.addDocument(convertConformanceDocumentComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Conformance.ConformanceStatementKind convertConformanceStatementKind(org.hl7.fhir.dstu2016may.model.Conformance.ConformanceStatementKind src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case INSTANCE: return org.hl7.fhir.dstu3.model.Conformance.ConformanceStatementKind.INSTANCE;
    case CAPABILITY: return org.hl7.fhir.dstu3.model.Conformance.ConformanceStatementKind.CAPABILITY;
    case REQUIREMENTS: return org.hl7.fhir.dstu3.model.Conformance.ConformanceStatementKind.REQUIREMENTS;
    default: return org.hl7.fhir.dstu3.model.Conformance.ConformanceStatementKind.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Conformance.ConformanceStatementKind convertConformanceStatementKind(org.hl7.fhir.dstu3.model.Conformance.ConformanceStatementKind src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case INSTANCE: return org.hl7.fhir.dstu2016may.model.Conformance.ConformanceStatementKind.INSTANCE;
    case CAPABILITY: return org.hl7.fhir.dstu2016may.model.Conformance.ConformanceStatementKind.CAPABILITY;
    case REQUIREMENTS: return org.hl7.fhir.dstu2016may.model.Conformance.ConformanceStatementKind.REQUIREMENTS;
    default: return org.hl7.fhir.dstu2016may.model.Conformance.ConformanceStatementKind.NULL;
    }
  }

  private static org.hl7.fhir.dstu3.model.Conformance.UnknownContentCode convertUnknownContentCode(org.hl7.fhir.dstu2016may.model.Conformance.UnknownContentCode src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case NO: return org.hl7.fhir.dstu3.model.Conformance.UnknownContentCode.NO;
    case EXTENSIONS: return org.hl7.fhir.dstu3.model.Conformance.UnknownContentCode.EXTENSIONS;
    case ELEMENTS: return org.hl7.fhir.dstu3.model.Conformance.UnknownContentCode.ELEMENTS;
    case BOTH: return org.hl7.fhir.dstu3.model.Conformance.UnknownContentCode.BOTH;
    default: return org.hl7.fhir.dstu3.model.Conformance.UnknownContentCode.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Conformance.UnknownContentCode convertUnknownContentCode(org.hl7.fhir.dstu3.model.Conformance.UnknownContentCode src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case NO: return org.hl7.fhir.dstu2016may.model.Conformance.UnknownContentCode.NO;
    case EXTENSIONS: return org.hl7.fhir.dstu2016may.model.Conformance.UnknownContentCode.EXTENSIONS;
    case ELEMENTS: return org.hl7.fhir.dstu2016may.model.Conformance.UnknownContentCode.ELEMENTS;
    case BOTH: return org.hl7.fhir.dstu2016may.model.Conformance.UnknownContentCode.BOTH;
    default: return org.hl7.fhir.dstu2016may.model.Conformance.UnknownContentCode.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceContactComponent convertConformanceContactComponent(org.hl7.fhir.dstu2016may.model.Conformance.ConformanceContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceContactComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2016may.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Conformance.ConformanceContactComponent convertConformanceContactComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Conformance.ConformanceContactComponent tgt = new org.hl7.fhir.dstu2016may.model.Conformance.ConformanceContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceSoftwareComponent convertConformanceSoftwareComponent(org.hl7.fhir.dstu2016may.model.Conformance.ConformanceSoftwareComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceSoftwareComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceSoftwareComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setVersion(src.getVersion());
    tgt.setReleaseDate(src.getReleaseDate());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Conformance.ConformanceSoftwareComponent convertConformanceSoftwareComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceSoftwareComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Conformance.ConformanceSoftwareComponent tgt = new org.hl7.fhir.dstu2016may.model.Conformance.ConformanceSoftwareComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setVersion(src.getVersion());
    tgt.setReleaseDate(src.getReleaseDate());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceImplementationComponent convertConformanceImplementationComponent(org.hl7.fhir.dstu2016may.model.Conformance.ConformanceImplementationComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceImplementationComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceImplementationComponent();
    copyElement(src, tgt);
    tgt.setDescription(src.getDescription());
    tgt.setUrl(src.getUrl());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Conformance.ConformanceImplementationComponent convertConformanceImplementationComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceImplementationComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Conformance.ConformanceImplementationComponent tgt = new org.hl7.fhir.dstu2016may.model.Conformance.ConformanceImplementationComponent();
    copyElement(src, tgt);
    tgt.setDescription(src.getDescription());
    tgt.setUrl(src.getUrl());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceRestComponent convertConformanceRestComponent(org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceRestComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceRestComponent();
    copyElement(src, tgt);
    tgt.setMode(convertRestfulConformanceMode(src.getMode()));
    tgt.setDocumentation(src.getDocumentation());
    tgt.setSecurity(convertConformanceRestSecurityComponent(src.getSecurity()));
    for (org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestResourceComponent t : src.getResource())
      tgt.addResource(convertConformanceRestResourceComponent(t));
    for (org.hl7.fhir.dstu2016may.model.Conformance.SystemInteractionComponent t : src.getInteraction())
      tgt.addInteraction(convertSystemInteractionComponent(t));
    for (org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestResourceSearchParamComponent t : src.getSearchParam())
      tgt.addSearchParam(convertConformanceRestResourceSearchParamComponent(t));
    for (org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestOperationComponent t : src.getOperation())
      tgt.addOperation(convertConformanceRestOperationComponent(t));
    for (org.hl7.fhir.dstu2016may.model.UriType t : src.getCompartment())
      tgt.addCompartment(t.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestComponent convertConformanceRestComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceRestComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestComponent tgt = new org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestComponent();
    copyElement(src, tgt);
    tgt.setMode(convertRestfulConformanceMode(src.getMode()));
    tgt.setDocumentation(src.getDocumentation());
    tgt.setSecurity(convertConformanceRestSecurityComponent(src.getSecurity()));
    for (org.hl7.fhir.dstu3.model.Conformance.ConformanceRestResourceComponent t : src.getResource())
      tgt.addResource(convertConformanceRestResourceComponent(t));
    for (org.hl7.fhir.dstu3.model.Conformance.SystemInteractionComponent t : src.getInteraction())
      tgt.addInteraction(convertSystemInteractionComponent(t));
    for (org.hl7.fhir.dstu3.model.Conformance.ConformanceRestResourceSearchParamComponent t : src.getSearchParam())
      tgt.addSearchParam(convertConformanceRestResourceSearchParamComponent(t));
    for (org.hl7.fhir.dstu3.model.Conformance.ConformanceRestOperationComponent t : src.getOperation())
      tgt.addOperation(convertConformanceRestOperationComponent(t));
    for (org.hl7.fhir.dstu3.model.UriType t : src.getCompartment())
      tgt.addCompartment(t.getValue());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Conformance.RestfulConformanceMode convertRestfulConformanceMode(org.hl7.fhir.dstu2016may.model.Conformance.RestfulConformanceMode src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case CLIENT: return org.hl7.fhir.dstu3.model.Conformance.RestfulConformanceMode.CLIENT;
    case SERVER: return org.hl7.fhir.dstu3.model.Conformance.RestfulConformanceMode.SERVER;
    default: return org.hl7.fhir.dstu3.model.Conformance.RestfulConformanceMode.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Conformance.RestfulConformanceMode convertRestfulConformanceMode(org.hl7.fhir.dstu3.model.Conformance.RestfulConformanceMode src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case CLIENT: return org.hl7.fhir.dstu2016may.model.Conformance.RestfulConformanceMode.CLIENT;
    case SERVER: return org.hl7.fhir.dstu2016may.model.Conformance.RestfulConformanceMode.SERVER;
    default: return org.hl7.fhir.dstu2016may.model.Conformance.RestfulConformanceMode.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceRestSecurityComponent convertConformanceRestSecurityComponent(org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestSecurityComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceRestSecurityComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceRestSecurityComponent();
    copyElement(src, tgt);
    tgt.setCors(src.getCors());
    for (org.hl7.fhir.dstu2016may.model.CodeableConcept t : src.getService())
      tgt.addService(convertCodeableConcept(t));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestSecurityCertificateComponent t : src.getCertificate())
      tgt.addCertificate(convertConformanceRestSecurityCertificateComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestSecurityComponent convertConformanceRestSecurityComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceRestSecurityComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestSecurityComponent tgt = new org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestSecurityComponent();
    copyElement(src, tgt);
    tgt.setCors(src.getCors());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getService())
      tgt.addService(convertCodeableConcept(t));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.Conformance.ConformanceRestSecurityCertificateComponent t : src.getCertificate())
      tgt.addCertificate(convertConformanceRestSecurityCertificateComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceRestSecurityCertificateComponent convertConformanceRestSecurityCertificateComponent(org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestSecurityCertificateComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceRestSecurityCertificateComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceRestSecurityCertificateComponent();
    copyElement(src, tgt);
    tgt.setType(src.getType());
    tgt.setBlob(src.getBlob());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestSecurityCertificateComponent convertConformanceRestSecurityCertificateComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceRestSecurityCertificateComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestSecurityCertificateComponent tgt = new org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestSecurityCertificateComponent();
    copyElement(src, tgt);
    tgt.setType(src.getType());
    tgt.setBlob(src.getBlob());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceRestResourceComponent convertConformanceRestResourceComponent(org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestResourceComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceRestResourceComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceRestResourceComponent();
    copyElement(src, tgt);
    tgt.setType(src.getType());
    tgt.setProfile(convertReference(src.getProfile()));
    for (org.hl7.fhir.dstu2016may.model.Conformance.ResourceInteractionComponent t : src.getInteraction())
      tgt.addInteraction(convertResourceInteractionComponent(t));
    tgt.setVersioning(convertResourceVersionPolicy(src.getVersioning()));
    tgt.setReadHistory(src.getReadHistory());
    tgt.setUpdateCreate(src.getUpdateCreate());
    tgt.setConditionalCreate(src.getConditionalCreate());
    tgt.setConditionalUpdate(src.getConditionalUpdate());
    tgt.setConditionalDelete(convertConditionalDeleteStatus(src.getConditionalDelete()));
    for (org.hl7.fhir.dstu2016may.model.StringType t : src.getSearchInclude())
      tgt.addSearchInclude(t.getValue());
    for (org.hl7.fhir.dstu2016may.model.StringType t : src.getSearchRevInclude())
      tgt.addSearchRevInclude(t.getValue());
    for (org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestResourceSearchParamComponent t : src.getSearchParam())
      tgt.addSearchParam(convertConformanceRestResourceSearchParamComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestResourceComponent convertConformanceRestResourceComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceRestResourceComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestResourceComponent tgt = new org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestResourceComponent();
    copyElement(src, tgt);
    tgt.setType(src.getType());
    tgt.setProfile(convertReference(src.getProfile()));
    for (org.hl7.fhir.dstu3.model.Conformance.ResourceInteractionComponent t : src.getInteraction())
      tgt.addInteraction(convertResourceInteractionComponent(t));
    tgt.setVersioning(convertResourceVersionPolicy(src.getVersioning()));
    tgt.setReadHistory(src.getReadHistory());
    tgt.setUpdateCreate(src.getUpdateCreate());
    tgt.setConditionalCreate(src.getConditionalCreate());
    tgt.setConditionalUpdate(src.getConditionalUpdate());
    tgt.setConditionalDelete(convertConditionalDeleteStatus(src.getConditionalDelete()));
    for (org.hl7.fhir.dstu3.model.StringType t : src.getSearchInclude())
      tgt.addSearchInclude(t.getValue());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getSearchRevInclude())
      tgt.addSearchRevInclude(t.getValue());
    for (org.hl7.fhir.dstu3.model.Conformance.ConformanceRestResourceSearchParamComponent t : src.getSearchParam())
      tgt.addSearchParam(convertConformanceRestResourceSearchParamComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Conformance.ResourceVersionPolicy convertResourceVersionPolicy(org.hl7.fhir.dstu2016may.model.Conformance.ResourceVersionPolicy src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case NOVERSION: return org.hl7.fhir.dstu3.model.Conformance.ResourceVersionPolicy.NOVERSION;
    case VERSIONED: return org.hl7.fhir.dstu3.model.Conformance.ResourceVersionPolicy.VERSIONED;
    case VERSIONEDUPDATE: return org.hl7.fhir.dstu3.model.Conformance.ResourceVersionPolicy.VERSIONEDUPDATE;
    default: return org.hl7.fhir.dstu3.model.Conformance.ResourceVersionPolicy.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Conformance.ResourceVersionPolicy convertResourceVersionPolicy(org.hl7.fhir.dstu3.model.Conformance.ResourceVersionPolicy src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case NOVERSION: return org.hl7.fhir.dstu2016may.model.Conformance.ResourceVersionPolicy.NOVERSION;
    case VERSIONED: return org.hl7.fhir.dstu2016may.model.Conformance.ResourceVersionPolicy.VERSIONED;
    case VERSIONEDUPDATE: return org.hl7.fhir.dstu2016may.model.Conformance.ResourceVersionPolicy.VERSIONEDUPDATE;
    default: return org.hl7.fhir.dstu2016may.model.Conformance.ResourceVersionPolicy.NULL;
    }
  }

  private static org.hl7.fhir.dstu3.model.Conformance.ConditionalDeleteStatus convertConditionalDeleteStatus(org.hl7.fhir.dstu2016may.model.Conformance.ConditionalDeleteStatus src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case NOTSUPPORTED: return org.hl7.fhir.dstu3.model.Conformance.ConditionalDeleteStatus.NOTSUPPORTED;
    case SINGLE: return org.hl7.fhir.dstu3.model.Conformance.ConditionalDeleteStatus.SINGLE;
    case MULTIPLE: return org.hl7.fhir.dstu3.model.Conformance.ConditionalDeleteStatus.MULTIPLE;
    default: return org.hl7.fhir.dstu3.model.Conformance.ConditionalDeleteStatus.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Conformance.ConditionalDeleteStatus convertConditionalDeleteStatus(org.hl7.fhir.dstu3.model.Conformance.ConditionalDeleteStatus src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case NOTSUPPORTED: return org.hl7.fhir.dstu2016may.model.Conformance.ConditionalDeleteStatus.NOTSUPPORTED;
    case SINGLE: return org.hl7.fhir.dstu2016may.model.Conformance.ConditionalDeleteStatus.SINGLE;
    case MULTIPLE: return org.hl7.fhir.dstu2016may.model.Conformance.ConditionalDeleteStatus.MULTIPLE;
    default: return org.hl7.fhir.dstu2016may.model.Conformance.ConditionalDeleteStatus.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.Conformance.ResourceInteractionComponent convertResourceInteractionComponent(org.hl7.fhir.dstu2016may.model.Conformance.ResourceInteractionComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ResourceInteractionComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ResourceInteractionComponent();
    copyElement(src, tgt);
    tgt.setCode(convertTypeRestfulInteraction(src.getCode()));
    tgt.setDocumentation(src.getDocumentation());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Conformance.ResourceInteractionComponent convertResourceInteractionComponent(org.hl7.fhir.dstu3.model.Conformance.ResourceInteractionComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Conformance.ResourceInteractionComponent tgt = new org.hl7.fhir.dstu2016may.model.Conformance.ResourceInteractionComponent();
    copyElement(src, tgt);
    tgt.setCode(convertTypeRestfulInteraction(src.getCode()));
    tgt.setDocumentation(src.getDocumentation());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Conformance.TypeRestfulInteraction convertTypeRestfulInteraction(org.hl7.fhir.dstu2016may.model.Conformance.TypeRestfulInteraction src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case READ: return org.hl7.fhir.dstu3.model.Conformance.TypeRestfulInteraction.READ;
    case VREAD: return org.hl7.fhir.dstu3.model.Conformance.TypeRestfulInteraction.VREAD;
    case UPDATE: return org.hl7.fhir.dstu3.model.Conformance.TypeRestfulInteraction.UPDATE;
    case DELETE: return org.hl7.fhir.dstu3.model.Conformance.TypeRestfulInteraction.DELETE;
    case HISTORYINSTANCE: return org.hl7.fhir.dstu3.model.Conformance.TypeRestfulInteraction.HISTORYINSTANCE;
    case HISTORYTYPE: return org.hl7.fhir.dstu3.model.Conformance.TypeRestfulInteraction.HISTORYTYPE;
    case CREATE: return org.hl7.fhir.dstu3.model.Conformance.TypeRestfulInteraction.CREATE;
    case SEARCHTYPE: return org.hl7.fhir.dstu3.model.Conformance.TypeRestfulInteraction.SEARCHTYPE;
    default: return org.hl7.fhir.dstu3.model.Conformance.TypeRestfulInteraction.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Conformance.TypeRestfulInteraction convertTypeRestfulInteraction(org.hl7.fhir.dstu3.model.Conformance.TypeRestfulInteraction src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case READ: return org.hl7.fhir.dstu2016may.model.Conformance.TypeRestfulInteraction.READ;
    case VREAD: return org.hl7.fhir.dstu2016may.model.Conformance.TypeRestfulInteraction.VREAD;
    case UPDATE: return org.hl7.fhir.dstu2016may.model.Conformance.TypeRestfulInteraction.UPDATE;
    case DELETE: return org.hl7.fhir.dstu2016may.model.Conformance.TypeRestfulInteraction.DELETE;
    case HISTORYINSTANCE: return org.hl7.fhir.dstu2016may.model.Conformance.TypeRestfulInteraction.HISTORYINSTANCE;
    case HISTORYTYPE: return org.hl7.fhir.dstu2016may.model.Conformance.TypeRestfulInteraction.HISTORYTYPE;
    case CREATE: return org.hl7.fhir.dstu2016may.model.Conformance.TypeRestfulInteraction.CREATE;
    case SEARCHTYPE: return org.hl7.fhir.dstu2016may.model.Conformance.TypeRestfulInteraction.SEARCHTYPE;
    default: return org.hl7.fhir.dstu2016may.model.Conformance.TypeRestfulInteraction.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.Enumerations.SearchParamType convertSearchParamType(org.hl7.fhir.dstu2016may.model.Enumerations.SearchParamType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case NUMBER: return org.hl7.fhir.dstu3.model.Enumerations.SearchParamType.NUMBER;
    case DATE: return org.hl7.fhir.dstu3.model.Enumerations.SearchParamType.DATE;
    case STRING: return org.hl7.fhir.dstu3.model.Enumerations.SearchParamType.STRING;
    case TOKEN: return org.hl7.fhir.dstu3.model.Enumerations.SearchParamType.TOKEN;
    case REFERENCE: return org.hl7.fhir.dstu3.model.Enumerations.SearchParamType.REFERENCE;
    case COMPOSITE: return org.hl7.fhir.dstu3.model.Enumerations.SearchParamType.COMPOSITE;
    case QUANTITY: return org.hl7.fhir.dstu3.model.Enumerations.SearchParamType.QUANTITY;
    case URI: return org.hl7.fhir.dstu3.model.Enumerations.SearchParamType.URI;
    default: return org.hl7.fhir.dstu3.model.Enumerations.SearchParamType.NULL;
    }
  }

  public static org.hl7.fhir.dstu2016may.model.Enumerations.SearchParamType convertSearchParamType(org.hl7.fhir.dstu3.model.Enumerations.SearchParamType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case NUMBER: return org.hl7.fhir.dstu2016may.model.Enumerations.SearchParamType.NUMBER;
    case DATE: return org.hl7.fhir.dstu2016may.model.Enumerations.SearchParamType.DATE;
    case STRING: return org.hl7.fhir.dstu2016may.model.Enumerations.SearchParamType.STRING;
    case TOKEN: return org.hl7.fhir.dstu2016may.model.Enumerations.SearchParamType.TOKEN;
    case REFERENCE: return org.hl7.fhir.dstu2016may.model.Enumerations.SearchParamType.REFERENCE;
    case COMPOSITE: return org.hl7.fhir.dstu2016may.model.Enumerations.SearchParamType.COMPOSITE;
    case QUANTITY: return org.hl7.fhir.dstu2016may.model.Enumerations.SearchParamType.QUANTITY;
    case URI: return org.hl7.fhir.dstu2016may.model.Enumerations.SearchParamType.URI;
    default: return org.hl7.fhir.dstu2016may.model.Enumerations.SearchParamType.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceRestResourceSearchParamComponent convertConformanceRestResourceSearchParamComponent(org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestResourceSearchParamComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceRestResourceSearchParamComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceRestResourceSearchParamComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setDefinition(src.getDefinition());
    tgt.setType(convertSearchParamType(src.getType()));
    tgt.setDocumentation(src.getDocumentation());
    for (org.hl7.fhir.dstu2016may.model.CodeType t : src.getTarget())
      tgt.addTarget(t.getValue());
    for (org.hl7.fhir.dstu2016may.model.Enumeration<org.hl7.fhir.dstu2016may.model.Conformance.SearchModifierCode> t : src.getModifier())
      tgt.addModifier(convertSearchModifierCode(t.getValue()));
    for (org.hl7.fhir.dstu2016may.model.StringType t : src.getChain())
      tgt.addChain(t.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestResourceSearchParamComponent convertConformanceRestResourceSearchParamComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceRestResourceSearchParamComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestResourceSearchParamComponent tgt = new org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestResourceSearchParamComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setDefinition(src.getDefinition());
    tgt.setType(convertSearchParamType(src.getType()));
    tgt.setDocumentation(src.getDocumentation());
    for (org.hl7.fhir.dstu3.model.CodeType t : src.getTarget())
      tgt.addTarget(t.getValue());
    for (org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode> t : src.getModifier())
      tgt.addModifier(convertSearchModifierCode(t.getValue()));
    for (org.hl7.fhir.dstu3.model.StringType t : src.getChain())
      tgt.addChain(t.getValue());
    return tgt;
  }


  private static org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode convertSearchModifierCode(org.hl7.fhir.dstu2016may.model.Conformance.SearchModifierCode src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case MISSING: return org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode.MISSING;
    case EXACT: return org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode.EXACT;
    case CONTAINS: return org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode.CONTAINS;
    case NOT: return org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode.NOT;
    case TEXT: return org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode.TEXT;
    case IN: return org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode.IN;
    case NOTIN: return org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode.NOTIN;
    case BELOW: return org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode.BELOW;
    case ABOVE: return org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode.ABOVE;
    case TYPE: return org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode.TYPE;
    default: return org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Conformance.SearchModifierCode convertSearchModifierCode(org.hl7.fhir.dstu3.model.Conformance.SearchModifierCode src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case MISSING: return org.hl7.fhir.dstu2016may.model.Conformance.SearchModifierCode.MISSING;
    case EXACT: return org.hl7.fhir.dstu2016may.model.Conformance.SearchModifierCode.EXACT;
    case CONTAINS: return org.hl7.fhir.dstu2016may.model.Conformance.SearchModifierCode.CONTAINS;
    case NOT: return org.hl7.fhir.dstu2016may.model.Conformance.SearchModifierCode.NOT;
    case TEXT: return org.hl7.fhir.dstu2016may.model.Conformance.SearchModifierCode.TEXT;
    case IN: return org.hl7.fhir.dstu2016may.model.Conformance.SearchModifierCode.IN;
    case NOTIN: return org.hl7.fhir.dstu2016may.model.Conformance.SearchModifierCode.NOTIN;
    case BELOW: return org.hl7.fhir.dstu2016may.model.Conformance.SearchModifierCode.BELOW;
    case ABOVE: return org.hl7.fhir.dstu2016may.model.Conformance.SearchModifierCode.ABOVE;
    case TYPE: return org.hl7.fhir.dstu2016may.model.Conformance.SearchModifierCode.TYPE;
    default: return org.hl7.fhir.dstu2016may.model.Conformance.SearchModifierCode.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.Conformance.SystemInteractionComponent convertSystemInteractionComponent(org.hl7.fhir.dstu2016may.model.Conformance.SystemInteractionComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Conformance.SystemInteractionComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.SystemInteractionComponent();
    copyElement(src, tgt);
    tgt.setCode(convertSystemRestfulInteraction(src.getCode()));
    tgt.setDocumentation(src.getDocumentation());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Conformance.SystemInteractionComponent convertSystemInteractionComponent(org.hl7.fhir.dstu3.model.Conformance.SystemInteractionComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Conformance.SystemInteractionComponent tgt = new org.hl7.fhir.dstu2016may.model.Conformance.SystemInteractionComponent();
    copyElement(src, tgt);
    tgt.setCode(convertSystemRestfulInteraction(src.getCode()));
    tgt.setDocumentation(src.getDocumentation());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Conformance.SystemRestfulInteraction convertSystemRestfulInteraction(org.hl7.fhir.dstu2016may.model.Conformance.SystemRestfulInteraction src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case TRANSACTION: return org.hl7.fhir.dstu3.model.Conformance.SystemRestfulInteraction.TRANSACTION;
    case SEARCHSYSTEM: return org.hl7.fhir.dstu3.model.Conformance.SystemRestfulInteraction.SEARCHSYSTEM;
    case HISTORYSYSTEM: return org.hl7.fhir.dstu3.model.Conformance.SystemRestfulInteraction.HISTORYSYSTEM;
    default: return org.hl7.fhir.dstu3.model.Conformance.SystemRestfulInteraction.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Conformance.SystemRestfulInteraction convertSystemRestfulInteraction(org.hl7.fhir.dstu3.model.Conformance.SystemRestfulInteraction src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case TRANSACTION: return org.hl7.fhir.dstu2016may.model.Conformance.SystemRestfulInteraction.TRANSACTION;
    case SEARCHSYSTEM: return org.hl7.fhir.dstu2016may.model.Conformance.SystemRestfulInteraction.SEARCHSYSTEM;
    case HISTORYSYSTEM: return org.hl7.fhir.dstu2016may.model.Conformance.SystemRestfulInteraction.HISTORYSYSTEM;
    default: return org.hl7.fhir.dstu2016may.model.Conformance.SystemRestfulInteraction.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceRestOperationComponent convertConformanceRestOperationComponent(org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestOperationComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceRestOperationComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceRestOperationComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setDefinition(convertReference(src.getDefinition()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestOperationComponent convertConformanceRestOperationComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceRestOperationComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestOperationComponent tgt = new org.hl7.fhir.dstu2016may.model.Conformance.ConformanceRestOperationComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setDefinition(convertReference(src.getDefinition()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingComponent convertConformanceMessagingComponent(org.hl7.fhir.dstu2016may.model.Conformance.ConformanceMessagingComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2016may.model.Conformance.ConformanceMessagingEndpointComponent t : src.getEndpoint())
      tgt.addEndpoint(convertConformanceMessagingEndpointComponent(t));
    tgt.setReliableCache(src.getReliableCache());
    tgt.setDocumentation(src.getDocumentation());
    for (org.hl7.fhir.dstu2016may.model.Conformance.ConformanceMessagingEventComponent t : src.getEvent())
      tgt.addEvent(convertConformanceMessagingEventComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Conformance.ConformanceMessagingComponent convertConformanceMessagingComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Conformance.ConformanceMessagingComponent tgt = new org.hl7.fhir.dstu2016may.model.Conformance.ConformanceMessagingComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingEndpointComponent t : src.getEndpoint())
      tgt.addEndpoint(convertConformanceMessagingEndpointComponent(t));
    tgt.setReliableCache(src.getReliableCache());
    tgt.setDocumentation(src.getDocumentation());
    for (org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingEventComponent t : src.getEvent())
      tgt.addEvent(convertConformanceMessagingEventComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingEndpointComponent convertConformanceMessagingEndpointComponent(org.hl7.fhir.dstu2016may.model.Conformance.ConformanceMessagingEndpointComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingEndpointComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingEndpointComponent();
    copyElement(src, tgt);
    tgt.setProtocol(convertCoding(src.getProtocol()));
    tgt.setAddress(src.getAddress());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Conformance.ConformanceMessagingEndpointComponent convertConformanceMessagingEndpointComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingEndpointComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Conformance.ConformanceMessagingEndpointComponent tgt = new org.hl7.fhir.dstu2016may.model.Conformance.ConformanceMessagingEndpointComponent();
    copyElement(src, tgt);
    tgt.setProtocol(convertCoding(src.getProtocol()));
    tgt.setAddress(src.getAddress());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingEventComponent convertConformanceMessagingEventComponent(org.hl7.fhir.dstu2016may.model.Conformance.ConformanceMessagingEventComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingEventComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingEventComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCoding(src.getCode()));
    tgt.setCategory(convertMessageSignificanceCategory(src.getCategory()));
    tgt.setMode(convertConformanceEventMode(src.getMode()));
    tgt.setFocus(src.getFocus());
    tgt.setRequest(convertReference(src.getRequest()));
    tgt.setResponse(convertReference(src.getResponse()));
    tgt.setDocumentation(src.getDocumentation());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Conformance.ConformanceMessagingEventComponent convertConformanceMessagingEventComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceMessagingEventComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Conformance.ConformanceMessagingEventComponent tgt = new org.hl7.fhir.dstu2016may.model.Conformance.ConformanceMessagingEventComponent();
    copyElement(src, tgt);
    tgt.setCode(convertCoding(src.getCode()));
    tgt.setCategory(convertMessageSignificanceCategory(src.getCategory()));
    tgt.setMode(convertConformanceEventMode(src.getMode()));
    tgt.setFocus(src.getFocus());
    tgt.setRequest(convertReference(src.getRequest()));
    tgt.setResponse(convertReference(src.getResponse()));
    tgt.setDocumentation(src.getDocumentation());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Conformance.MessageSignificanceCategory convertMessageSignificanceCategory(org.hl7.fhir.dstu2016may.model.Conformance.MessageSignificanceCategory src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case CONSEQUENCE: return org.hl7.fhir.dstu3.model.Conformance.MessageSignificanceCategory.CONSEQUENCE;
    case CURRENCY: return org.hl7.fhir.dstu3.model.Conformance.MessageSignificanceCategory.CURRENCY;
    case NOTIFICATION: return org.hl7.fhir.dstu3.model.Conformance.MessageSignificanceCategory.NOTIFICATION;
    default: return org.hl7.fhir.dstu3.model.Conformance.MessageSignificanceCategory.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Conformance.MessageSignificanceCategory convertMessageSignificanceCategory(org.hl7.fhir.dstu3.model.Conformance.MessageSignificanceCategory src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case CONSEQUENCE: return org.hl7.fhir.dstu2016may.model.Conformance.MessageSignificanceCategory.CONSEQUENCE;
    case CURRENCY: return org.hl7.fhir.dstu2016may.model.Conformance.MessageSignificanceCategory.CURRENCY;
    case NOTIFICATION: return org.hl7.fhir.dstu2016may.model.Conformance.MessageSignificanceCategory.NOTIFICATION;
    default: return org.hl7.fhir.dstu2016may.model.Conformance.MessageSignificanceCategory.NULL;
    }
  }

  private static org.hl7.fhir.dstu3.model.Conformance.ConformanceEventMode convertConformanceEventMode(org.hl7.fhir.dstu2016may.model.Conformance.ConformanceEventMode src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case SENDER: return org.hl7.fhir.dstu3.model.Conformance.ConformanceEventMode.SENDER;
    case RECEIVER: return org.hl7.fhir.dstu3.model.Conformance.ConformanceEventMode.RECEIVER;
    default: return org.hl7.fhir.dstu3.model.Conformance.ConformanceEventMode.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Conformance.ConformanceEventMode convertConformanceEventMode(org.hl7.fhir.dstu3.model.Conformance.ConformanceEventMode src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case SENDER: return org.hl7.fhir.dstu2016may.model.Conformance.ConformanceEventMode.SENDER;
    case RECEIVER: return org.hl7.fhir.dstu2016may.model.Conformance.ConformanceEventMode.RECEIVER;
    default: return org.hl7.fhir.dstu2016may.model.Conformance.ConformanceEventMode.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.Conformance.ConformanceDocumentComponent convertConformanceDocumentComponent(org.hl7.fhir.dstu2016may.model.Conformance.ConformanceDocumentComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Conformance.ConformanceDocumentComponent tgt = new org.hl7.fhir.dstu3.model.Conformance.ConformanceDocumentComponent();
    copyElement(src, tgt);
    tgt.setMode(convertDocumentMode(src.getMode()));
    tgt.setDocumentation(src.getDocumentation());
    tgt.setProfile(convertReference(src.getProfile()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Conformance.ConformanceDocumentComponent convertConformanceDocumentComponent(org.hl7.fhir.dstu3.model.Conformance.ConformanceDocumentComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Conformance.ConformanceDocumentComponent tgt = new org.hl7.fhir.dstu2016may.model.Conformance.ConformanceDocumentComponent();
    copyElement(src, tgt);
    tgt.setMode(convertDocumentMode(src.getMode()));
    tgt.setDocumentation(src.getDocumentation());
    tgt.setProfile(convertReference(src.getProfile()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Conformance.DocumentMode convertDocumentMode(org.hl7.fhir.dstu2016may.model.Conformance.DocumentMode src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case PRODUCER: return org.hl7.fhir.dstu3.model.Conformance.DocumentMode.PRODUCER;
    case CONSUMER: return org.hl7.fhir.dstu3.model.Conformance.DocumentMode.CONSUMER;
    default: return org.hl7.fhir.dstu3.model.Conformance.DocumentMode.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Conformance.DocumentMode convertDocumentMode(org.hl7.fhir.dstu3.model.Conformance.DocumentMode src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case PRODUCER: return org.hl7.fhir.dstu2016may.model.Conformance.DocumentMode.PRODUCER;
    case CONSUMER: return org.hl7.fhir.dstu2016may.model.Conformance.DocumentMode.CONSUMER;
    default: return org.hl7.fhir.dstu2016may.model.Conformance.DocumentMode.NULL;
    }
  }


  public static org.hl7.fhir.dstu3.model.DataElement convertDataElement(org.hl7.fhir.dstu2016may.model.DataElement src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.DataElement tgt = new org.hl7.fhir.dstu3.model.DataElement();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    for (org.hl7.fhir.dstu2016may.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setVersion(src.getVersion());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    tgt.setDate(src.getDate());
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2016may.model.DataElement.DataElementContactComponent t : src.getContact())
      tgt.addContact(convertDataElementContactComponent(t));
    for (org.hl7.fhir.dstu2016may.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setCopyright(src.getCopyright());
    tgt.setStringency(convertDataElementStringency(src.getStringency()));
    for (org.hl7.fhir.dstu2016may.model.DataElement.DataElementMappingComponent t : src.getMapping())
      tgt.addMapping(convertDataElementMappingComponent(t));
    for (org.hl7.fhir.dstu2016may.model.ElementDefinition t : src.getElement())
      tgt.addElement(convertElementDefinition(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.DataElement convertDataElement(org.hl7.fhir.dstu3.model.DataElement src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.DataElement tgt = new org.hl7.fhir.dstu2016may.model.DataElement();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setVersion(src.getVersion());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    tgt.setDate(src.getDate());
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.DataElement.DataElementContactComponent t : src.getContact())
      tgt.addContact(convertDataElementContactComponent(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setCopyright(src.getCopyright());
    tgt.setStringency(convertDataElementStringency(src.getStringency()));
    for (org.hl7.fhir.dstu3.model.DataElement.DataElementMappingComponent t : src.getMapping())
      tgt.addMapping(convertDataElementMappingComponent(t));
    for (org.hl7.fhir.dstu3.model.ElementDefinition t : src.getElement())
      tgt.addElement(convertElementDefinition(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.DataElement.DataElementStringency convertDataElementStringency(org.hl7.fhir.dstu2016may.model.DataElement.DataElementStringency src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case COMPARABLE: return org.hl7.fhir.dstu3.model.DataElement.DataElementStringency.COMPARABLE;
    case FULLYSPECIFIED: return org.hl7.fhir.dstu3.model.DataElement.DataElementStringency.FULLYSPECIFIED;
    case EQUIVALENT: return org.hl7.fhir.dstu3.model.DataElement.DataElementStringency.EQUIVALENT;
    case CONVERTABLE: return org.hl7.fhir.dstu3.model.DataElement.DataElementStringency.CONVERTABLE;
    case SCALEABLE: return org.hl7.fhir.dstu3.model.DataElement.DataElementStringency.SCALEABLE;
    case FLEXIBLE: return org.hl7.fhir.dstu3.model.DataElement.DataElementStringency.FLEXIBLE;
    default: return org.hl7.fhir.dstu3.model.DataElement.DataElementStringency.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.DataElement.DataElementStringency convertDataElementStringency(org.hl7.fhir.dstu3.model.DataElement.DataElementStringency src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case COMPARABLE: return org.hl7.fhir.dstu2016may.model.DataElement.DataElementStringency.COMPARABLE;
    case FULLYSPECIFIED: return org.hl7.fhir.dstu2016may.model.DataElement.DataElementStringency.FULLYSPECIFIED;
    case EQUIVALENT: return org.hl7.fhir.dstu2016may.model.DataElement.DataElementStringency.EQUIVALENT;
    case CONVERTABLE: return org.hl7.fhir.dstu2016may.model.DataElement.DataElementStringency.CONVERTABLE;
    case SCALEABLE: return org.hl7.fhir.dstu2016may.model.DataElement.DataElementStringency.SCALEABLE;
    case FLEXIBLE: return org.hl7.fhir.dstu2016may.model.DataElement.DataElementStringency.FLEXIBLE;
    default: return org.hl7.fhir.dstu2016may.model.DataElement.DataElementStringency.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.DataElement.DataElementContactComponent convertDataElementContactComponent(org.hl7.fhir.dstu2016may.model.DataElement.DataElementContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.DataElement.DataElementContactComponent tgt = new org.hl7.fhir.dstu3.model.DataElement.DataElementContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2016may.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.DataElement.DataElementContactComponent convertDataElementContactComponent(org.hl7.fhir.dstu3.model.DataElement.DataElementContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.DataElement.DataElementContactComponent tgt = new org.hl7.fhir.dstu2016may.model.DataElement.DataElementContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.DataElement.DataElementMappingComponent convertDataElementMappingComponent(org.hl7.fhir.dstu2016may.model.DataElement.DataElementMappingComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.DataElement.DataElementMappingComponent tgt = new org.hl7.fhir.dstu3.model.DataElement.DataElementMappingComponent();
    copyElement(src, tgt);
    tgt.setIdentity(src.getIdentity());
    tgt.setUri(src.getUri());
    tgt.setName(src.getName());
    tgt.setComment(src.getComment());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.DataElement.DataElementMappingComponent convertDataElementMappingComponent(org.hl7.fhir.dstu3.model.DataElement.DataElementMappingComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.DataElement.DataElementMappingComponent tgt = new org.hl7.fhir.dstu2016may.model.DataElement.DataElementMappingComponent();
    copyElement(src, tgt);
    tgt.setIdentity(src.getIdentity());
    tgt.setUri(src.getUri());
    tgt.setName(src.getName());
    tgt.setComment(src.getComment());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ImplementationGuide convertImplementationGuide(org.hl7.fhir.dstu2016may.model.ImplementationGuide src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ImplementationGuide tgt = new org.hl7.fhir.dstu3.model.ImplementationGuide();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuideContactComponent t : src.getContact())
      tgt.addContact(convertImplementationGuideContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2016may.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setCopyright(src.getCopyright());
    tgt.setFhirVersion(src.getFhirVersion());
    for (org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuideDependencyComponent t : src.getDependency())
      tgt.addDependency(convertImplementationGuideDependencyComponent(t));
    for (org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuidePackageComponent t : src.getPackage())
      tgt.addPackage(convertImplementationGuidePackageComponent(t));
    for (org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuideGlobalComponent t : src.getGlobal())
      tgt.addGlobal(convertImplementationGuideGlobalComponent(t));
    for (org.hl7.fhir.dstu2016may.model.UriType t : src.getBinary())
      tgt.addBinary(t.getValue());
    tgt.setPage(convertImplementationGuidePageComponent(src.getPage()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ImplementationGuide convertImplementationGuide(org.hl7.fhir.dstu3.model.ImplementationGuide src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ImplementationGuide tgt = new org.hl7.fhir.dstu2016may.model.ImplementationGuide();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideContactComponent t : src.getContact())
      tgt.addContact(convertImplementationGuideContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setCopyright(src.getCopyright());
    tgt.setFhirVersion(src.getFhirVersion());
    for (org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideDependencyComponent t : src.getDependency())
      tgt.addDependency(convertImplementationGuideDependencyComponent(t));
    for (org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePackageComponent t : src.getPackage())
      tgt.addPackage(convertImplementationGuidePackageComponent(t));
    for (org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideGlobalComponent t : src.getGlobal())
      tgt.addGlobal(convertImplementationGuideGlobalComponent(t));
    for (org.hl7.fhir.dstu3.model.UriType t : src.getBinary())
      tgt.addBinary(t.getValue());
    tgt.setPage(convertImplementationGuidePageComponent(src.getPage()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideContactComponent convertImplementationGuideContactComponent(org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuideContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideContactComponent tgt = new org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2016may.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuideContactComponent convertImplementationGuideContactComponent(org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuideContactComponent tgt = new org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuideContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideDependencyComponent convertImplementationGuideDependencyComponent(org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuideDependencyComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideDependencyComponent tgt = new org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideDependencyComponent();
    copyElement(src, tgt);
    tgt.setType(convertGuideDependencyType(src.getType()));
    tgt.setUri(src.getUri());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuideDependencyComponent convertImplementationGuideDependencyComponent(org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideDependencyComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuideDependencyComponent tgt = new org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuideDependencyComponent();
    copyElement(src, tgt);
    tgt.setType(convertGuideDependencyType(src.getType()));
    tgt.setUri(src.getUri());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.ImplementationGuide.GuideDependencyType convertGuideDependencyType(org.hl7.fhir.dstu2016may.model.ImplementationGuide.GuideDependencyType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case REFERENCE: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuideDependencyType.REFERENCE;
    case INCLUSION: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuideDependencyType.INCLUSION;
    default: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuideDependencyType.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.ImplementationGuide.GuideDependencyType convertGuideDependencyType(org.hl7.fhir.dstu3.model.ImplementationGuide.GuideDependencyType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case REFERENCE: return org.hl7.fhir.dstu2016may.model.ImplementationGuide.GuideDependencyType.REFERENCE;
    case INCLUSION: return org.hl7.fhir.dstu2016may.model.ImplementationGuide.GuideDependencyType.INCLUSION;
    default: return org.hl7.fhir.dstu2016may.model.ImplementationGuide.GuideDependencyType.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePackageComponent convertImplementationGuidePackageComponent(org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuidePackageComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePackageComponent tgt = new org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePackageComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuidePackageResourceComponent t : src.getResource())
      tgt.addResource(convertImplementationGuidePackageResourceComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuidePackageComponent convertImplementationGuidePackageComponent(org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePackageComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuidePackageComponent tgt = new org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuidePackageComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePackageResourceComponent t : src.getResource())
      tgt.addResource(convertImplementationGuidePackageResourceComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePackageResourceComponent convertImplementationGuidePackageResourceComponent(org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuidePackageResourceComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePackageResourceComponent tgt = new org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePackageResourceComponent();
    copyElement(src, tgt);
    tgt.setExample(src.getExample());
    tgt.setName(src.getName());
    tgt.setDescription(src.getDescription());
    tgt.setAcronym(src.getAcronym());
    tgt.setSource(convertType(src.getSource()));
    tgt.setExampleFor(convertReference(src.getExampleFor()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuidePackageResourceComponent convertImplementationGuidePackageResourceComponent(org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePackageResourceComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuidePackageResourceComponent tgt = new org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuidePackageResourceComponent();
    copyElement(src, tgt);
    tgt.setExample(src.getExample());
    tgt.setName(src.getName());
    tgt.setDescription(src.getDescription());
    tgt.setAcronym(src.getAcronym());
    tgt.setSource(convertType(src.getSource()));
    tgt.setExampleFor(convertReference(src.getExampleFor()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideGlobalComponent convertImplementationGuideGlobalComponent(org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuideGlobalComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideGlobalComponent tgt = new org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideGlobalComponent();
    copyElement(src, tgt);
    tgt.setType(src.getType());
    tgt.setProfile(convertReference(src.getProfile()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuideGlobalComponent convertImplementationGuideGlobalComponent(org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuideGlobalComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuideGlobalComponent tgt = new org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuideGlobalComponent();
    copyElement(src, tgt);
    tgt.setType(src.getType());
    tgt.setProfile(convertReference(src.getProfile()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePageComponent convertImplementationGuidePageComponent(org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuidePageComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePageComponent tgt = new org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePageComponent();
    copyElement(src, tgt);
    tgt.setSource(src.getSource());
    tgt.setTitle(src.getName());
    tgt.setKind(convertGuidePageKind(src.getKind()));
    for (org.hl7.fhir.dstu2016may.model.CodeType t : src.getType())
      tgt.addType(t.getValue());
    for (org.hl7.fhir.dstu2016may.model.StringType t : src.getPackage())
      tgt.addPackage(t.getValue());
    tgt.setFormat(src.getFormat());
    for (org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuidePageComponent t : src.getPage())
      tgt.addPage(convertImplementationGuidePageComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuidePageComponent convertImplementationGuidePageComponent(org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePageComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuidePageComponent tgt = new org.hl7.fhir.dstu2016may.model.ImplementationGuide.ImplementationGuidePageComponent();
    copyElement(src, tgt);
    tgt.setSource(src.getSource());
    tgt.setName(src.getTitle());
    tgt.setKind(convertGuidePageKind(src.getKind()));
    for (org.hl7.fhir.dstu3.model.CodeType t : src.getType())
      tgt.addType(t.getValue());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getPackage())
      tgt.addPackage(t.getValue());
    tgt.setFormat(src.getFormat());
    for (org.hl7.fhir.dstu3.model.ImplementationGuide.ImplementationGuidePageComponent t : src.getPage())
      tgt.addPage(convertImplementationGuidePageComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.ImplementationGuide.GuidePageKind convertGuidePageKind(org.hl7.fhir.dstu2016may.model.ImplementationGuide.GuidePageKind src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case PAGE: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuidePageKind.PAGE;
    case EXAMPLE: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuidePageKind.EXAMPLE;
    case LIST: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuidePageKind.LIST;
    case INCLUDE: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuidePageKind.INCLUDE;
    case DIRECTORY: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuidePageKind.DIRECTORY;
    case DICTIONARY: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuidePageKind.DICTIONARY;
    case TOC: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuidePageKind.TOC;
    case RESOURCE: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuidePageKind.RESOURCE;
    default: return org.hl7.fhir.dstu3.model.ImplementationGuide.GuidePageKind.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.ImplementationGuide.GuidePageKind convertGuidePageKind(org.hl7.fhir.dstu3.model.ImplementationGuide.GuidePageKind src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case PAGE: return org.hl7.fhir.dstu2016may.model.ImplementationGuide.GuidePageKind.PAGE;
    case EXAMPLE: return org.hl7.fhir.dstu2016may.model.ImplementationGuide.GuidePageKind.EXAMPLE;
    case LIST: return org.hl7.fhir.dstu2016may.model.ImplementationGuide.GuidePageKind.LIST;
    case INCLUDE: return org.hl7.fhir.dstu2016may.model.ImplementationGuide.GuidePageKind.INCLUDE;
    case DIRECTORY: return org.hl7.fhir.dstu2016may.model.ImplementationGuide.GuidePageKind.DIRECTORY;
    case DICTIONARY: return org.hl7.fhir.dstu2016may.model.ImplementationGuide.GuidePageKind.DICTIONARY;
    case TOC: return org.hl7.fhir.dstu2016may.model.ImplementationGuide.GuidePageKind.TOC;
    case RESOURCE: return org.hl7.fhir.dstu2016may.model.ImplementationGuide.GuidePageKind.RESOURCE;
    default: return org.hl7.fhir.dstu2016may.model.ImplementationGuide.GuidePageKind.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.NamingSystem convertNamingSystem(org.hl7.fhir.dstu2016may.model.NamingSystem src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.NamingSystem tgt = new org.hl7.fhir.dstu3.model.NamingSystem();
    copyDomainResource(src, tgt);
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setKind(convertNamingSystemType(src.getKind()));
    tgt.setDate(src.getDate());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu2016may.model.NamingSystem.NamingSystemContactComponent t : src.getContact())
      tgt.addContact(convertNamingSystemContactComponent(t));
    tgt.setResponsible(src.getResponsible());
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2016may.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setUsage(src.getUsage());
    for (org.hl7.fhir.dstu2016may.model.NamingSystem.NamingSystemUniqueIdComponent t : src.getUniqueId())
      tgt.addUniqueId(convertNamingSystemUniqueIdComponent(t));
    tgt.setReplacedBy(convertReference(src.getReplacedBy()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.NamingSystem convertNamingSystem(org.hl7.fhir.dstu3.model.NamingSystem src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.NamingSystem tgt = new org.hl7.fhir.dstu2016may.model.NamingSystem();
    copyDomainResource(src, tgt);
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setKind(convertNamingSystemType(src.getKind()));
    tgt.setDate(src.getDate());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemContactComponent t : src.getContact())
      tgt.addContact(convertNamingSystemContactComponent(t));
    tgt.setResponsible(src.getResponsible());
    tgt.setType(convertCodeableConcept(src.getType()));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setUsage(src.getUsage());
    for (org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemUniqueIdComponent t : src.getUniqueId())
      tgt.addUniqueId(convertNamingSystemUniqueIdComponent(t));
    tgt.setReplacedBy(convertReference(src.getReplacedBy()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemType convertNamingSystemType(org.hl7.fhir.dstu2016may.model.NamingSystem.NamingSystemType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case CODESYSTEM: return org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemType.CODESYSTEM;
    case IDENTIFIER: return org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemType.IDENTIFIER;
    case ROOT: return org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemType.ROOT;
    default: return org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemType.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.NamingSystem.NamingSystemType convertNamingSystemType(org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case CODESYSTEM: return org.hl7.fhir.dstu2016may.model.NamingSystem.NamingSystemType.CODESYSTEM;
    case IDENTIFIER: return org.hl7.fhir.dstu2016may.model.NamingSystem.NamingSystemType.IDENTIFIER;
    case ROOT: return org.hl7.fhir.dstu2016may.model.NamingSystem.NamingSystemType.ROOT;
    default: return org.hl7.fhir.dstu2016may.model.NamingSystem.NamingSystemType.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemContactComponent convertNamingSystemContactComponent(org.hl7.fhir.dstu2016may.model.NamingSystem.NamingSystemContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemContactComponent tgt = new org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2016may.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.NamingSystem.NamingSystemContactComponent convertNamingSystemContactComponent(org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.NamingSystem.NamingSystemContactComponent tgt = new org.hl7.fhir.dstu2016may.model.NamingSystem.NamingSystemContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemUniqueIdComponent convertNamingSystemUniqueIdComponent(org.hl7.fhir.dstu2016may.model.NamingSystem.NamingSystemUniqueIdComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemUniqueIdComponent tgt = new org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemUniqueIdComponent();
    copyElement(src, tgt);
    tgt.setType(convertNamingSystemIdentifierType(src.getType()));
    tgt.setValue(src.getValue());
    tgt.setPreferred(src.getPreferred());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.NamingSystem.NamingSystemUniqueIdComponent convertNamingSystemUniqueIdComponent(org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemUniqueIdComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.NamingSystem.NamingSystemUniqueIdComponent tgt = new org.hl7.fhir.dstu2016may.model.NamingSystem.NamingSystemUniqueIdComponent();
    copyElement(src, tgt);
    tgt.setType(convertNamingSystemIdentifierType(src.getType()));
    tgt.setValue(src.getValue());
    tgt.setPreferred(src.getPreferred());
    tgt.setPeriod(convertPeriod(src.getPeriod()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemIdentifierType convertNamingSystemIdentifierType(org.hl7.fhir.dstu2016may.model.NamingSystem.NamingSystemIdentifierType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case OID: return org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemIdentifierType.OID;
    case UUID: return org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemIdentifierType.UUID;
    case URI: return org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemIdentifierType.URI;
    case OTHER: return org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemIdentifierType.OTHER;
    default: return org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemIdentifierType.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.NamingSystem.NamingSystemIdentifierType convertNamingSystemIdentifierType(org.hl7.fhir.dstu3.model.NamingSystem.NamingSystemIdentifierType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case OID: return org.hl7.fhir.dstu2016may.model.NamingSystem.NamingSystemIdentifierType.OID;
    case UUID: return org.hl7.fhir.dstu2016may.model.NamingSystem.NamingSystemIdentifierType.UUID;
    case URI: return org.hl7.fhir.dstu2016may.model.NamingSystem.NamingSystemIdentifierType.URI;
    case OTHER: return org.hl7.fhir.dstu2016may.model.NamingSystem.NamingSystemIdentifierType.OTHER;
    default: return org.hl7.fhir.dstu2016may.model.NamingSystem.NamingSystemIdentifierType.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.OperationDefinition convertOperationDefinition(org.hl7.fhir.dstu2016may.model.OperationDefinition src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.OperationDefinition tgt = new org.hl7.fhir.dstu3.model.OperationDefinition();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setKind(convertOperationKind(src.getKind()));
    tgt.setExperimental(src.getExperimental());
    tgt.setDate(src.getDate());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionContactComponent t : src.getContact())
      tgt.addContact(convertOperationDefinitionContactComponent(t));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2016may.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setIdempotent(src.getIdempotent());
    tgt.setCode(src.getCode());
    tgt.setComment(src.getComment());
    tgt.setBase(convertReference(src.getBase()));
    tgt.setSystem(src.getSystem());
    for (org.hl7.fhir.dstu2016may.model.CodeType t : src.getType())
      tgt.addType(t.getValue());
    tgt.setInstance(src.getInstance());
    for (org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionParameterComponent t : src.getParameter())
      tgt.addParameter(convertOperationDefinitionParameterComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.OperationDefinition convertOperationDefinition(org.hl7.fhir.dstu3.model.OperationDefinition src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.OperationDefinition tgt = new org.hl7.fhir.dstu2016may.model.OperationDefinition();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setKind(convertOperationKind(src.getKind()));
    tgt.setExperimental(src.getExperimental());
    tgt.setDate(src.getDate());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionContactComponent t : src.getContact())
      tgt.addContact(convertOperationDefinitionContactComponent(t));
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setIdempotent(src.getIdempotent());
    tgt.setCode(src.getCode());
    tgt.setComment(src.getComment());
    tgt.setBase(convertReference(src.getBase()));
    tgt.setSystem(src.getSystem());
    for (org.hl7.fhir.dstu3.model.CodeType t : src.getType())
      tgt.addType(t.getValue());
    tgt.setInstance(src.getInstance());
    for (org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionParameterComponent t : src.getParameter())
      tgt.addParameter(convertOperationDefinitionParameterComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.OperationDefinition.OperationKind convertOperationKind(org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationKind src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case OPERATION: return org.hl7.fhir.dstu3.model.OperationDefinition.OperationKind.OPERATION;
    case QUERY: return org.hl7.fhir.dstu3.model.OperationDefinition.OperationKind.QUERY;
    default: return org.hl7.fhir.dstu3.model.OperationDefinition.OperationKind.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationKind convertOperationKind(org.hl7.fhir.dstu3.model.OperationDefinition.OperationKind src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case OPERATION: return org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationKind.OPERATION;
    case QUERY: return org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationKind.QUERY;
    default: return org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationKind.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionContactComponent convertOperationDefinitionContactComponent(org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionContactComponent tgt = new org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2016may.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionContactComponent convertOperationDefinitionContactComponent(org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionContactComponent tgt = new org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionParameterComponent convertOperationDefinitionParameterComponent(org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionParameterComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionParameterComponent tgt = new org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionParameterComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setUse(convertOperationParameterUse(src.getUse()));
    tgt.setMin(src.getMin());
    tgt.setMax(src.getMax());
    tgt.setDocumentation(src.getDocumentation());
    tgt.setType(src.getType());
    tgt.setSearchType(convertSearchParamType(src.getSearchType()));
    tgt.setProfile(convertReference(src.getProfile()));
    tgt.setBinding(convertOperationDefinitionParameterBindingComponent(src.getBinding()));
    for (org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionParameterComponent t : src.getPart())
      tgt.addPart(convertOperationDefinitionParameterComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionParameterComponent convertOperationDefinitionParameterComponent(org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionParameterComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionParameterComponent tgt = new org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionParameterComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setUse(convertOperationParameterUse(src.getUse()));
    tgt.setMin(src.getMin());
    tgt.setMax(src.getMax());
    tgt.setDocumentation(src.getDocumentation());
    tgt.setType(src.getType());
    tgt.setSearchType(convertSearchParamType(src.getSearchType()));
    tgt.setProfile(convertReference(src.getProfile()));
    tgt.setBinding(convertOperationDefinitionParameterBindingComponent(src.getBinding()));
    for (org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionParameterComponent t : src.getPart())
      tgt.addPart(convertOperationDefinitionParameterComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.OperationDefinition.OperationParameterUse convertOperationParameterUse(org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationParameterUse src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case IN: return org.hl7.fhir.dstu3.model.OperationDefinition.OperationParameterUse.IN;
    case OUT: return org.hl7.fhir.dstu3.model.OperationDefinition.OperationParameterUse.OUT;
    default: return org.hl7.fhir.dstu3.model.OperationDefinition.OperationParameterUse.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationParameterUse convertOperationParameterUse(org.hl7.fhir.dstu3.model.OperationDefinition.OperationParameterUse src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case IN: return org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationParameterUse.IN;
    case OUT: return org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationParameterUse.OUT;
    default: return org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationParameterUse.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionParameterBindingComponent convertOperationDefinitionParameterBindingComponent(org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionParameterBindingComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionParameterBindingComponent tgt = new org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionParameterBindingComponent();
    copyElement(src, tgt);
    tgt.setStrength(convertBindingStrength(src.getStrength()));
    tgt.setValueSet(convertType(src.getValueSet()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionParameterBindingComponent convertOperationDefinitionParameterBindingComponent(org.hl7.fhir.dstu3.model.OperationDefinition.OperationDefinitionParameterBindingComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionParameterBindingComponent tgt = new org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionParameterBindingComponent();
    copyElement(src, tgt);
    tgt.setStrength(convertBindingStrength(src.getStrength()));
    tgt.setValueSet(convertType(src.getValueSet()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.OperationOutcome convertOperationOutcome(org.hl7.fhir.dstu2016may.model.OperationOutcome src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.OperationOutcome tgt = new org.hl7.fhir.dstu3.model.OperationOutcome();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2016may.model.OperationOutcome.OperationOutcomeIssueComponent t : src.getIssue())
      tgt.addIssue(convertOperationOutcomeIssueComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.OperationOutcome convertOperationOutcome(org.hl7.fhir.dstu3.model.OperationOutcome src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.OperationOutcome tgt = new org.hl7.fhir.dstu2016may.model.OperationOutcome();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.OperationOutcome.OperationOutcomeIssueComponent t : src.getIssue())
      tgt.addIssue(convertOperationOutcomeIssueComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.OperationOutcome.OperationOutcomeIssueComponent convertOperationOutcomeIssueComponent(org.hl7.fhir.dstu2016may.model.OperationOutcome.OperationOutcomeIssueComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.OperationOutcome.OperationOutcomeIssueComponent tgt = new org.hl7.fhir.dstu3.model.OperationOutcome.OperationOutcomeIssueComponent();
    copyElement(src, tgt);
    tgt.setSeverity(convertIssueSeverity(src.getSeverity()));
    tgt.setCode(convertIssueType(src.getCode()));
    tgt.setDetails(convertCodeableConcept(src.getDetails()));
    tgt.setDiagnostics(src.getDiagnostics());
    for (org.hl7.fhir.dstu2016may.model.StringType t : src.getLocation())
      tgt.addLocation(t.getValue());
    for (org.hl7.fhir.dstu2016may.model.StringType t : src.getExpression())
      tgt.addExpression(t.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.OperationOutcome.OperationOutcomeIssueComponent convertOperationOutcomeIssueComponent(org.hl7.fhir.dstu3.model.OperationOutcome.OperationOutcomeIssueComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.OperationOutcome.OperationOutcomeIssueComponent tgt = new org.hl7.fhir.dstu2016may.model.OperationOutcome.OperationOutcomeIssueComponent();
    copyElement(src, tgt);
    tgt.setSeverity(convertIssueSeverity(src.getSeverity()));
    tgt.setCode(convertIssueType(src.getCode()));
    tgt.setDetails(convertCodeableConcept(src.getDetails()));
    tgt.setDiagnostics(src.getDiagnostics());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getLocation())
      tgt.addLocation(t.getValue());
    for (org.hl7.fhir.dstu3.model.StringType t : src.getExpression())
      tgt.addExpression(t.getValue());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.OperationOutcome.IssueSeverity convertIssueSeverity(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueSeverity src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case FATAL: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueSeverity.FATAL;
    case ERROR: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueSeverity.ERROR;
    case WARNING: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueSeverity.WARNING;
    case INFORMATION: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueSeverity.INFORMATION;
    default: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueSeverity.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueSeverity convertIssueSeverity(org.hl7.fhir.dstu3.model.OperationOutcome.IssueSeverity src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case FATAL: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueSeverity.FATAL;
    case ERROR: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueSeverity.ERROR;
    case WARNING: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueSeverity.WARNING;
    case INFORMATION: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueSeverity.INFORMATION;
    default: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueSeverity.NULL;
    }
  }

  private static org.hl7.fhir.dstu3.model.OperationOutcome.IssueType convertIssueType(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case INVALID: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.INVALID;
    case STRUCTURE: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.STRUCTURE;
    case REQUIRED: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.REQUIRED;
    case VALUE: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.VALUE;
    case INVARIANT: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.INVARIANT;
    case SECURITY: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.SECURITY;
    case LOGIN: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.LOGIN;
    case UNKNOWN: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.UNKNOWN;
    case EXPIRED: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.EXPIRED;
    case FORBIDDEN: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.FORBIDDEN;
    case SUPPRESSED: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.SUPPRESSED;
    case PROCESSING: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.PROCESSING;
    case NOTSUPPORTED: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.NOTSUPPORTED;
    case DUPLICATE: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.DUPLICATE;
    case NOTFOUND: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.NOTFOUND;
    case TOOLONG: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.TOOLONG;
    case CODEINVALID: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.CODEINVALID;
    case EXTENSION: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.EXTENSION;
    case TOOCOSTLY: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.TOOCOSTLY;
    case BUSINESSRULE: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.BUSINESSRULE;
    case CONFLICT: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.CONFLICT;
    case INCOMPLETE: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.INCOMPLETE;
    case TRANSIENT: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.TRANSIENT;
    case LOCKERROR: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.LOCKERROR;
    case NOSTORE: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.NOSTORE;
    case EXCEPTION: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.EXCEPTION;
    case TIMEOUT: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.TIMEOUT;
    case THROTTLED: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.THROTTLED;
    case INFORMATIONAL: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.INFORMATIONAL;
    default: return org.hl7.fhir.dstu3.model.OperationOutcome.IssueType.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType convertIssueType(org.hl7.fhir.dstu3.model.OperationOutcome.IssueType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case INVALID: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.INVALID;
    case STRUCTURE: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.STRUCTURE;
    case REQUIRED: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.REQUIRED;
    case VALUE: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.VALUE;
    case INVARIANT: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.INVARIANT;
    case SECURITY: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.SECURITY;
    case LOGIN: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.LOGIN;
    case UNKNOWN: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.UNKNOWN;
    case EXPIRED: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.EXPIRED;
    case FORBIDDEN: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.FORBIDDEN;
    case SUPPRESSED: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.SUPPRESSED;
    case PROCESSING: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.PROCESSING;
    case NOTSUPPORTED: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.NOTSUPPORTED;
    case DUPLICATE: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.DUPLICATE;
    case NOTFOUND: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.NOTFOUND;
    case TOOLONG: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.TOOLONG;
    case CODEINVALID: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.CODEINVALID;
    case EXTENSION: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.EXTENSION;
    case TOOCOSTLY: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.TOOCOSTLY;
    case BUSINESSRULE: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.BUSINESSRULE;
    case CONFLICT: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.CONFLICT;
    case INCOMPLETE: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.INCOMPLETE;
    case TRANSIENT: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.TRANSIENT;
    case LOCKERROR: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.LOCKERROR;
    case NOSTORE: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.NOSTORE;
    case EXCEPTION: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.EXCEPTION;
    case TIMEOUT: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.TIMEOUT;
    case THROTTLED: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.THROTTLED;
    case INFORMATIONAL: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.INFORMATIONAL;
    default: return org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.NULL;
    }
  }


  public static org.hl7.fhir.dstu3.model.Questionnaire convertQuestionnaire(org.hl7.fhir.dstu2016may.model.Questionnaire src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Questionnaire tgt = new org.hl7.fhir.dstu3.model.Questionnaire();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    for (org.hl7.fhir.dstu2016may.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setVersion(src.getVersion());
    tgt.setStatus(convertQuestionnaireStatus(src.getStatus()));
    tgt.setDate(src.getDate());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu2016may.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    for (org.hl7.fhir.dstu2016may.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setTitle(src.getTitle());
    for (org.hl7.fhir.dstu2016may.model.Coding t : src.getConcept())
      tgt.addConcept(convertCoding(t));
    for (org.hl7.fhir.dstu2016may.model.CodeType t : src.getSubjectType())
      tgt.addSubjectType(t.getValue());
    for (org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireItemComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Questionnaire convertQuestionnaire(org.hl7.fhir.dstu3.model.Questionnaire src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Questionnaire tgt = new org.hl7.fhir.dstu2016may.model.Questionnaire();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setVersion(src.getVersion());
    tgt.setStatus(convertQuestionnaireStatus(src.getStatus()));
    tgt.setDate(src.getDate());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setTitle(src.getTitle());
    for (org.hl7.fhir.dstu3.model.Coding t : src.getConcept())
      tgt.addConcept(convertCoding(t));
    for (org.hl7.fhir.dstu3.model.CodeType t : src.getSubjectType())
      tgt.addSubjectType(t.getValue());
    for (org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireItemComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireStatus convertQuestionnaireStatus(org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireStatus src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case DRAFT: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireStatus.DRAFT;
    case PUBLISHED: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireStatus.PUBLISHED;
    case RETIRED: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireStatus.RETIRED;
    default: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireStatus.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireStatus convertQuestionnaireStatus(org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireStatus src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case DRAFT: return org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireStatus.DRAFT;
    case PUBLISHED: return org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireStatus.PUBLISHED;
    case RETIRED: return org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireStatus.RETIRED;
    default: return org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireStatus.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent convertQuestionnaireItemComponent(org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent tgt = new org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent();
    copyElement(src, tgt);
    tgt.setLinkId(src.getLinkId());
    for (org.hl7.fhir.dstu2016may.model.Coding t : src.getConcept())
      tgt.addConcept(convertCoding(t));
    tgt.setPrefix(src.getPrefix());
    tgt.setText(src.getText());
    tgt.setType(convertQuestionnaireItemType(src.getType()));
    for (org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemEnableWhenComponent t : src.getEnableWhen())
      tgt.addEnableWhen(convertQuestionnaireItemEnableWhenComponent(t));
    tgt.setRequired(src.getRequired());
    tgt.setRepeats(src.getRepeats());
    tgt.setReadOnly(src.getReadOnly());
    tgt.setMaxLength(src.getMaxLength());
    tgt.setOptions(convertReference(src.getOptions()));
    for (org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemOptionComponent t : src.getOption())
      tgt.addOption(convertQuestionnaireItemOptionComponent(t));
    tgt.setInitial(convertType(src.getInitial()));
    for (org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireItemComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemComponent convertQuestionnaireItemComponent(org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemComponent tgt = new org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemComponent();
    copyElement(src, tgt);
    tgt.setLinkId(src.getLinkId());
    for (org.hl7.fhir.dstu3.model.Coding t : src.getConcept())
      tgt.addConcept(convertCoding(t));
    tgt.setPrefix(src.getPrefix());
    tgt.setText(src.getText());
    tgt.setType(convertQuestionnaireItemType(src.getType()));
    for (org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemEnableWhenComponent t : src.getEnableWhen())
      tgt.addEnableWhen(convertQuestionnaireItemEnableWhenComponent(t));
    tgt.setRequired(src.getRequired());
    tgt.setRepeats(src.getRepeats());
    tgt.setReadOnly(src.getReadOnly());
    tgt.setMaxLength(src.getMaxLength());
    tgt.setOptions(convertReference(src.getOptions()));
    for (org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemOptionComponent t : src.getOption())
      tgt.addOption(convertQuestionnaireItemOptionComponent(t));
    tgt.setInitial(convertType(src.getInitial()));
    for (org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireItemComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType convertQuestionnaireItemType(org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case GROUP: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.GROUP;
    case DISPLAY: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.DISPLAY;
    case QUESTION: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.QUESTION;
    case BOOLEAN: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.BOOLEAN;
    case DECIMAL: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.DECIMAL;
    case INTEGER: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.INTEGER;
    case DATE: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.DATE;
    case DATETIME: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.DATETIME;
    case INSTANT: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.INSTANT;
    case TIME: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.TIME;
    case STRING: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.STRING;
    case TEXT: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.TEXT;
    case URL: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.URL;
    case CHOICE: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.CHOICE;
    case OPENCHOICE: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.OPENCHOICE;
    case ATTACHMENT: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.ATTACHMENT;
    case REFERENCE: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.REFERENCE;
    case QUANTITY: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.QUANTITY;
    default: return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemType convertQuestionnaireItemType(org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case GROUP: return org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemType.GROUP;
    case DISPLAY: return org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemType.DISPLAY;
    case QUESTION: return org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemType.QUESTION;
    case BOOLEAN: return org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemType.BOOLEAN;
    case DECIMAL: return org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemType.DECIMAL;
    case INTEGER: return org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemType.INTEGER;
    case DATE: return org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemType.DATE;
    case DATETIME: return org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemType.DATETIME;
    case INSTANT: return org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemType.INSTANT;
    case TIME: return org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemType.TIME;
    case STRING: return org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemType.STRING;
    case TEXT: return org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemType.TEXT;
    case URL: return org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemType.URL;
    case CHOICE: return org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemType.CHOICE;
    case OPENCHOICE: return org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemType.OPENCHOICE;
    case ATTACHMENT: return org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemType.ATTACHMENT;
    case REFERENCE: return org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemType.REFERENCE;
    case QUANTITY: return org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemType.QUANTITY;
    default: return org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemType.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemEnableWhenComponent convertQuestionnaireItemEnableWhenComponent(org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemEnableWhenComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemEnableWhenComponent tgt = new org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemEnableWhenComponent();
    copyElement(src, tgt);
    tgt.setQuestion(src.getQuestion());
    tgt.setHasAnswer(src.getAnswered());
    tgt.setAnswer(convertType(src.getAnswer()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemEnableWhenComponent convertQuestionnaireItemEnableWhenComponent(org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemEnableWhenComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemEnableWhenComponent tgt = new org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemEnableWhenComponent();
    copyElement(src, tgt);
    tgt.setQuestion(src.getQuestion());
    tgt.setAnswered(src.getHasAnswer());
    tgt.setAnswer(convertType(src.getAnswer()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemOptionComponent convertQuestionnaireItemOptionComponent(org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemOptionComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemOptionComponent tgt = new org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemOptionComponent();
    copyElement(src, tgt);
    tgt.setValue(convertType(src.getValue()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemOptionComponent convertQuestionnaireItemOptionComponent(org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemOptionComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemOptionComponent tgt = new org.hl7.fhir.dstu2016may.model.Questionnaire.QuestionnaireItemOptionComponent();
    copyElement(src, tgt);
    tgt.setValue(convertType(src.getValue()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.QuestionnaireResponse convertQuestionnaireResponse(org.hl7.fhir.dstu2016may.model.QuestionnaireResponse src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.QuestionnaireResponse tgt = new org.hl7.fhir.dstu3.model.QuestionnaireResponse();
    copyDomainResource(src, tgt);
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setQuestionnaire(convertReference(src.getQuestionnaire()));
    tgt.setStatus(convertQuestionnaireResponseStatus(src.getStatus()));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setContext(convertReference(src.getEncounter()));
    tgt.setAuthor(convertReference(src.getAuthor()));
    tgt.setAuthored(src.getAuthored());
    tgt.setSource(convertReference(src.getSource()));
    for (org.hl7.fhir.dstu2016may.model.QuestionnaireResponse.QuestionnaireResponseItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireResponseItemComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.QuestionnaireResponse convertQuestionnaireResponse(org.hl7.fhir.dstu3.model.QuestionnaireResponse src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.QuestionnaireResponse tgt = new org.hl7.fhir.dstu2016may.model.QuestionnaireResponse();
    copyDomainResource(src, tgt);
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setQuestionnaire(convertReference(src.getQuestionnaire()));
    tgt.setStatus(convertQuestionnaireResponseStatus(src.getStatus()));
    tgt.setSubject(convertReference(src.getSubject()));
    tgt.setEncounter(convertReference(src.getContext()));
    tgt.setAuthor(convertReference(src.getAuthor()));
    tgt.setAuthored(src.getAuthored());
    tgt.setSource(convertReference(src.getSource()));
    for (org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireResponseItemComponent(t));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseStatus convertQuestionnaireResponseStatus(org.hl7.fhir.dstu2016may.model.QuestionnaireResponse.QuestionnaireResponseStatus src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case INPROGRESS: return org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseStatus.INPROGRESS;
    case COMPLETED: return org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseStatus.COMPLETED;
    case AMENDED: return org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseStatus.AMENDED;
    default: return org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseStatus.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.QuestionnaireResponse.QuestionnaireResponseStatus convertQuestionnaireResponseStatus(org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseStatus src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case INPROGRESS: return org.hl7.fhir.dstu2016may.model.QuestionnaireResponse.QuestionnaireResponseStatus.INPROGRESS;
    case COMPLETED: return org.hl7.fhir.dstu2016may.model.QuestionnaireResponse.QuestionnaireResponseStatus.COMPLETED;
    case AMENDED: return org.hl7.fhir.dstu2016may.model.QuestionnaireResponse.QuestionnaireResponseStatus.AMENDED;
    default: return org.hl7.fhir.dstu2016may.model.QuestionnaireResponse.QuestionnaireResponseStatus.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseItemComponent convertQuestionnaireResponseItemComponent(org.hl7.fhir.dstu2016may.model.QuestionnaireResponse.QuestionnaireResponseItemComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseItemComponent tgt = new org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseItemComponent();
    copyElement(src, tgt);
    tgt.setLinkId(src.getLinkId());
    tgt.setText(src.getText());
    tgt.setSubject(convertReference(src.getSubject()));
    for (org.hl7.fhir.dstu2016may.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent t : src.getAnswer())
      tgt.addAnswer(convertQuestionnaireResponseItemAnswerComponent(t));
    for (org.hl7.fhir.dstu2016may.model.QuestionnaireResponse.QuestionnaireResponseItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireResponseItemComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.QuestionnaireResponse.QuestionnaireResponseItemComponent convertQuestionnaireResponseItemComponent(org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseItemComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.QuestionnaireResponse.QuestionnaireResponseItemComponent tgt = new org.hl7.fhir.dstu2016may.model.QuestionnaireResponse.QuestionnaireResponseItemComponent();
    copyElement(src, tgt);
    tgt.setLinkId(src.getLinkId());
    tgt.setText(src.getText());
    tgt.setSubject(convertReference(src.getSubject()));
    for (org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent t : src.getAnswer())
      tgt.addAnswer(convertQuestionnaireResponseItemAnswerComponent(t));
    for (org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireResponseItemComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent convertQuestionnaireResponseItemAnswerComponent(org.hl7.fhir.dstu2016may.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent tgt = new org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent();
    copyElement(src, tgt);
    tgt.setValue(convertType(src.getValue()));
    for (org.hl7.fhir.dstu2016may.model.QuestionnaireResponse.QuestionnaireResponseItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireResponseItemComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent convertQuestionnaireResponseItemAnswerComponent(org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent tgt = new org.hl7.fhir.dstu2016may.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent();
    copyElement(src, tgt);
    tgt.setValue(convertType(src.getValue()));
    for (org.hl7.fhir.dstu3.model.QuestionnaireResponse.QuestionnaireResponseItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireResponseItemComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.SearchParameter convertSearchParameter(org.hl7.fhir.dstu2016may.model.SearchParameter src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.SearchParameter tgt = new org.hl7.fhir.dstu3.model.SearchParameter();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setDate(src.getDate());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu2016may.model.SearchParameter.SearchParameterContactComponent t : src.getContact())
      tgt.addContact(convertSearchParameterContactComponent(t));
    for (org.hl7.fhir.dstu2016may.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setCode(src.getCode());
    tgt.setBase(src.getBase());
    tgt.setType(convertSearchParamType(src.getType()));
    tgt.setDescription(src.getDescription());
    tgt.setExpression(src.getExpression());
    tgt.setXpath(src.getXpath());
    tgt.setXpathUsage(convertXPathUsageType(src.getXpathUsage()));
    for (org.hl7.fhir.dstu2016may.model.CodeType t : src.getTarget())
      tgt.addTarget(t.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.SearchParameter convertSearchParameter(org.hl7.fhir.dstu3.model.SearchParameter src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.SearchParameter tgt = new org.hl7.fhir.dstu2016may.model.SearchParameter();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setDate(src.getDate());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu3.model.SearchParameter.SearchParameterContactComponent t : src.getContact())
      tgt.addContact(convertSearchParameterContactComponent(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setCode(src.getCode());
    tgt.setBase(src.getBase());
    tgt.setType(convertSearchParamType(src.getType()));
    tgt.setDescription(src.getDescription());
    tgt.setExpression(src.getExpression());
    tgt.setXpath(src.getXpath());
    tgt.setXpathUsage(convertXPathUsageType(src.getXpathUsage()));
    for (org.hl7.fhir.dstu3.model.CodeType t : src.getTarget())
      tgt.addTarget(t.getValue());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.SearchParameter.XPathUsageType convertXPathUsageType(org.hl7.fhir.dstu2016may.model.SearchParameter.XPathUsageType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case NORMAL: return org.hl7.fhir.dstu3.model.SearchParameter.XPathUsageType.NORMAL;
    case PHONETIC: return org.hl7.fhir.dstu3.model.SearchParameter.XPathUsageType.PHONETIC;
    case NEARBY: return org.hl7.fhir.dstu3.model.SearchParameter.XPathUsageType.NEARBY;
    case DISTANCE: return org.hl7.fhir.dstu3.model.SearchParameter.XPathUsageType.DISTANCE;
    case OTHER: return org.hl7.fhir.dstu3.model.SearchParameter.XPathUsageType.OTHER;
    default: return org.hl7.fhir.dstu3.model.SearchParameter.XPathUsageType.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.SearchParameter.XPathUsageType convertXPathUsageType(org.hl7.fhir.dstu3.model.SearchParameter.XPathUsageType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case NORMAL: return org.hl7.fhir.dstu2016may.model.SearchParameter.XPathUsageType.NORMAL;
    case PHONETIC: return org.hl7.fhir.dstu2016may.model.SearchParameter.XPathUsageType.PHONETIC;
    case NEARBY: return org.hl7.fhir.dstu2016may.model.SearchParameter.XPathUsageType.NEARBY;
    case DISTANCE: return org.hl7.fhir.dstu2016may.model.SearchParameter.XPathUsageType.DISTANCE;
    case OTHER: return org.hl7.fhir.dstu2016may.model.SearchParameter.XPathUsageType.OTHER;
    default: return org.hl7.fhir.dstu2016may.model.SearchParameter.XPathUsageType.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.SearchParameter.SearchParameterContactComponent convertSearchParameterContactComponent(org.hl7.fhir.dstu2016may.model.SearchParameter.SearchParameterContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.SearchParameter.SearchParameterContactComponent tgt = new org.hl7.fhir.dstu3.model.SearchParameter.SearchParameterContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2016may.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.SearchParameter.SearchParameterContactComponent convertSearchParameterContactComponent(org.hl7.fhir.dstu3.model.SearchParameter.SearchParameterContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.SearchParameter.SearchParameterContactComponent tgt = new org.hl7.fhir.dstu2016may.model.SearchParameter.SearchParameterContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.StructureDefinition convertStructureDefinition(org.hl7.fhir.dstu2016may.model.StructureDefinition src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.StructureDefinition tgt = new org.hl7.fhir.dstu3.model.StructureDefinition();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    for (org.hl7.fhir.dstu2016may.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setDisplay(src.getDisplay());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionContactComponent t : src.getContact())
      tgt.addContact(convertStructureDefinitionContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2016may.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setCopyright(src.getCopyright());
    for (org.hl7.fhir.dstu2016may.model.Coding t : src.getCode())
      tgt.addCode(convertCoding(t));
    tgt.setFhirVersion(src.getFhirVersion());
    for (org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionMappingComponent t : src.getMapping())
      tgt.addMapping(convertStructureDefinitionMappingComponent(t));
    tgt.setKind(convertStructureDefinitionKind(src.getKind()));
    tgt.setAbstract(src.getAbstract());
    tgt.setContextType(convertExtensionContext(src.getContextType()));
    for (org.hl7.fhir.dstu2016may.model.StringType t : src.getContext())
      tgt.addContext(t.getValue());
    if (src.getDerivation() == TypeDerivationRule.CONSTRAINT)
      tgt.setType(src.getBaseType());
    else
      tgt.setType(src.getId());
    tgt.setBaseDefinition(src.getBaseDefinition());
    tgt.setDerivation(convertTypeDerivationRule(src.getDerivation()));
    tgt.setSnapshot(convertStructureDefinitionSnapshotComponent(src.getSnapshot()));
    if (tgt.hasSnapshot())
      tgt.getSnapshot().getElementFirstRep().getType().clear();
    tgt.setDifferential(convertStructureDefinitionDifferentialComponent(src.getDifferential()));
    if (tgt.hasDifferential())
      tgt.getDifferential().getElementFirstRep().getType().clear();
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.StructureDefinition convertStructureDefinition(org.hl7.fhir.dstu3.model.StructureDefinition src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.StructureDefinition tgt = new org.hl7.fhir.dstu2016may.model.StructureDefinition();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setDisplay(src.getDisplay());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionContactComponent t : src.getContact())
      tgt.addContact(convertStructureDefinitionContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setCopyright(src.getCopyright());
    for (org.hl7.fhir.dstu3.model.Coding t : src.getCode())
      tgt.addCode(convertCoding(t));
    tgt.setFhirVersion(src.getFhirVersion());
    for (org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionMappingComponent t : src.getMapping())
      tgt.addMapping(convertStructureDefinitionMappingComponent(t));
    tgt.setKind(convertStructureDefinitionKind(src.getKind()));
    tgt.setAbstract(src.getAbstract());
    tgt.setContextType(convertExtensionContext(src.getContextType()));
    for (org.hl7.fhir.dstu3.model.StringType t : src.getContext())
      tgt.addContext(t.getValue());
    tgt.setBaseType(src.getType());
    tgt.setBaseDefinition(src.getBaseDefinition());
    tgt.setDerivation(convertTypeDerivationRule(src.getDerivation()));
    tgt.setSnapshot(convertStructureDefinitionSnapshotComponent(src.getSnapshot()));
    tgt.setDifferential(convertStructureDefinitionDifferentialComponent(src.getDifferential()));
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionKind convertStructureDefinitionKind(org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionKind src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case DATATYPE: return org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionKind.COMPLEXTYPE;
    case RESOURCE: return org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionKind.RESOURCE;
    case LOGICAL: return org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionKind.LOGICAL;
    default: return org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionKind.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionKind convertStructureDefinitionKind(org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionKind src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case PRIMITIVETYPE: return org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionKind.DATATYPE;
    case COMPLEXTYPE: return org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionKind.DATATYPE;
    case RESOURCE: return org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionKind.RESOURCE;
    case LOGICAL: return org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionKind.LOGICAL;
    default: return org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionKind.NULL;
    }
  }

  private static org.hl7.fhir.dstu3.model.StructureDefinition.ExtensionContext convertExtensionContext(org.hl7.fhir.dstu2016may.model.StructureDefinition.ExtensionContext src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case RESOURCE: return org.hl7.fhir.dstu3.model.StructureDefinition.ExtensionContext.RESOURCE;
    case DATATYPE: return org.hl7.fhir.dstu3.model.StructureDefinition.ExtensionContext.DATATYPE;
    case EXTENSION: return org.hl7.fhir.dstu3.model.StructureDefinition.ExtensionContext.EXTENSION;
    default: return org.hl7.fhir.dstu3.model.StructureDefinition.ExtensionContext.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.StructureDefinition.ExtensionContext convertExtensionContext(org.hl7.fhir.dstu3.model.StructureDefinition.ExtensionContext src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case RESOURCE: return org.hl7.fhir.dstu2016may.model.StructureDefinition.ExtensionContext.RESOURCE;
    case DATATYPE: return org.hl7.fhir.dstu2016may.model.StructureDefinition.ExtensionContext.DATATYPE;
    case EXTENSION: return org.hl7.fhir.dstu2016may.model.StructureDefinition.ExtensionContext.EXTENSION;
    default: return org.hl7.fhir.dstu2016may.model.StructureDefinition.ExtensionContext.NULL;
    }
  }

  private static org.hl7.fhir.dstu3.model.StructureDefinition.TypeDerivationRule convertTypeDerivationRule(org.hl7.fhir.dstu2016may.model.StructureDefinition.TypeDerivationRule src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case SPECIALIZATION: return org.hl7.fhir.dstu3.model.StructureDefinition.TypeDerivationRule.SPECIALIZATION;
    case CONSTRAINT: return org.hl7.fhir.dstu3.model.StructureDefinition.TypeDerivationRule.CONSTRAINT;
    default: return org.hl7.fhir.dstu3.model.StructureDefinition.TypeDerivationRule.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.StructureDefinition.TypeDerivationRule convertTypeDerivationRule(org.hl7.fhir.dstu3.model.StructureDefinition.TypeDerivationRule src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case SPECIALIZATION: return org.hl7.fhir.dstu2016may.model.StructureDefinition.TypeDerivationRule.SPECIALIZATION;
    case CONSTRAINT: return org.hl7.fhir.dstu2016may.model.StructureDefinition.TypeDerivationRule.CONSTRAINT;
    default: return org.hl7.fhir.dstu2016may.model.StructureDefinition.TypeDerivationRule.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionContactComponent convertStructureDefinitionContactComponent(org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionContactComponent tgt = new org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2016may.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionContactComponent convertStructureDefinitionContactComponent(org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionContactComponent tgt = new org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionMappingComponent convertStructureDefinitionMappingComponent(org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionMappingComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionMappingComponent tgt = new org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionMappingComponent();
    copyElement(src, tgt);
    tgt.setIdentity(src.getIdentity());
    tgt.setUri(src.getUri());
    tgt.setName(src.getName());
    tgt.setComments(src.getComments());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionMappingComponent convertStructureDefinitionMappingComponent(org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionMappingComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionMappingComponent tgt = new org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionMappingComponent();
    copyElement(src, tgt);
    tgt.setIdentity(src.getIdentity());
    tgt.setUri(src.getUri());
    tgt.setName(src.getName());
    tgt.setComments(src.getComments());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionSnapshotComponent convertStructureDefinitionSnapshotComponent(org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionSnapshotComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionSnapshotComponent tgt = new org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionSnapshotComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2016may.model.ElementDefinition t : src.getElement())
      tgt.addElement(convertElementDefinition(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionSnapshotComponent convertStructureDefinitionSnapshotComponent(org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionSnapshotComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionSnapshotComponent tgt = new org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionSnapshotComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.ElementDefinition t : src.getElement())
      tgt.addElement(convertElementDefinition(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionDifferentialComponent convertStructureDefinitionDifferentialComponent(org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionDifferentialComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionDifferentialComponent tgt = new org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionDifferentialComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2016may.model.ElementDefinition t : src.getElement())
      tgt.addElement(convertElementDefinition(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionDifferentialComponent convertStructureDefinitionDifferentialComponent(org.hl7.fhir.dstu3.model.StructureDefinition.StructureDefinitionDifferentialComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionDifferentialComponent tgt = new org.hl7.fhir.dstu2016may.model.StructureDefinition.StructureDefinitionDifferentialComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.ElementDefinition t : src.getElement())
      tgt.addElement(convertElementDefinition(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript convertTestScript(org.hl7.fhir.dstu2016may.model.TestScript src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.TestScript tgt = new org.hl7.fhir.dstu3.model.TestScript();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu2016may.model.TestScript.TestScriptContactComponent t : src.getContact())
      tgt.addContact(convertTestScriptContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2016may.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setCopyright(src.getCopyright());
    for (org.hl7.fhir.dstu2016may.model.TestScript.TestScriptOriginComponent t : src.getOrigin())
      tgt.addOrigin(convertTestScriptOriginComponent(t));
    for (org.hl7.fhir.dstu2016may.model.TestScript.TestScriptDestinationComponent t : src.getDestination())
      tgt.addDestination(convertTestScriptDestinationComponent(t));
    tgt.setMetadata(convertTestScriptMetadataComponent(src.getMetadata()));
    for (org.hl7.fhir.dstu2016may.model.TestScript.TestScriptFixtureComponent t : src.getFixture())
      tgt.addFixture(convertTestScriptFixtureComponent(t));
    for (org.hl7.fhir.dstu2016may.model.Reference t : src.getProfile())
      tgt.addProfile(convertReference(t));
    for (org.hl7.fhir.dstu2016may.model.TestScript.TestScriptVariableComponent t : src.getVariable())
      tgt.addVariable(convertTestScriptVariableComponent(t));
    for (org.hl7.fhir.dstu2016may.model.TestScript.TestScriptRuleComponent t : src.getRule())
      tgt.addRule(convertTestScriptRuleComponent(t));
    for (org.hl7.fhir.dstu2016may.model.TestScript.TestScriptRulesetComponent t : src.getRuleset())
      tgt.addRuleset(convertTestScriptRulesetComponent(t));
    tgt.setSetup(convertTestScriptSetupComponent(src.getSetup()));
    for (org.hl7.fhir.dstu2016may.model.TestScript.TestScriptTestComponent t : src.getTest())
      tgt.addTest(convertTestScriptTestComponent(t));
    tgt.setTeardown(convertTestScriptTeardownComponent(src.getTeardown()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.TestScript convertTestScript(org.hl7.fhir.dstu3.model.TestScript src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.TestScript tgt = new org.hl7.fhir.dstu2016may.model.TestScript();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu3.model.TestScript.TestScriptContactComponent t : src.getContact())
      tgt.addContact(convertTestScriptContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setRequirements(src.getRequirements());
    tgt.setCopyright(src.getCopyright());
    for (org.hl7.fhir.dstu3.model.TestScript.TestScriptOriginComponent t : src.getOrigin())
      tgt.addOrigin(convertTestScriptOriginComponent(t));
    for (org.hl7.fhir.dstu3.model.TestScript.TestScriptDestinationComponent t : src.getDestination())
      tgt.addDestination(convertTestScriptDestinationComponent(t));
    tgt.setMetadata(convertTestScriptMetadataComponent(src.getMetadata()));
    for (org.hl7.fhir.dstu3.model.TestScript.TestScriptFixtureComponent t : src.getFixture())
      tgt.addFixture(convertTestScriptFixtureComponent(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getProfile())
      tgt.addProfile(convertReference(t));
    for (org.hl7.fhir.dstu3.model.TestScript.TestScriptVariableComponent t : src.getVariable())
      tgt.addVariable(convertTestScriptVariableComponent(t));
    for (org.hl7.fhir.dstu3.model.TestScript.TestScriptRuleComponent t : src.getRule())
      tgt.addRule(convertTestScriptRuleComponent(t));
    for (org.hl7.fhir.dstu3.model.TestScript.TestScriptRulesetComponent t : src.getRuleset())
      tgt.addRuleset(convertTestScriptRulesetComponent(t));
    tgt.setSetup(convertTestScriptSetupComponent(src.getSetup()));
    for (org.hl7.fhir.dstu3.model.TestScript.TestScriptTestComponent t : src.getTest())
      tgt.addTest(convertTestScriptTestComponent(t));
    tgt.setTeardown(convertTestScriptTeardownComponent(src.getTeardown()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptContactComponent convertTestScriptContactComponent(org.hl7.fhir.dstu2016may.model.TestScript.TestScriptContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptContactComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2016may.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.TestScript.TestScriptContactComponent convertTestScriptContactComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.TestScript.TestScriptContactComponent tgt = new org.hl7.fhir.dstu2016may.model.TestScript.TestScriptContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptOriginComponent convertTestScriptOriginComponent(org.hl7.fhir.dstu2016may.model.TestScript.TestScriptOriginComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptOriginComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptOriginComponent();
    copyElement(src, tgt);
    tgt.setIndex(src.getIndex());
    tgt.setProfile(convertCoding(src.getProfile()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.TestScript.TestScriptOriginComponent convertTestScriptOriginComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptOriginComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.TestScript.TestScriptOriginComponent tgt = new org.hl7.fhir.dstu2016may.model.TestScript.TestScriptOriginComponent();
    copyElement(src, tgt);
    tgt.setIndex(src.getIndex());
    tgt.setProfile(convertCoding(src.getProfile()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptDestinationComponent convertTestScriptDestinationComponent(org.hl7.fhir.dstu2016may.model.TestScript.TestScriptDestinationComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptDestinationComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptDestinationComponent();
    copyElement(src, tgt);
    tgt.setIndex(src.getIndex());
    tgt.setProfile(convertCoding(src.getProfile()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.TestScript.TestScriptDestinationComponent convertTestScriptDestinationComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptDestinationComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.TestScript.TestScriptDestinationComponent tgt = new org.hl7.fhir.dstu2016may.model.TestScript.TestScriptDestinationComponent();
    copyElement(src, tgt);
    tgt.setIndex(src.getIndex());
    tgt.setProfile(convertCoding(src.getProfile()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataComponent convertTestScriptMetadataComponent(org.hl7.fhir.dstu2016may.model.TestScript.TestScriptMetadataComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2016may.model.TestScript.TestScriptMetadataLinkComponent t : src.getLink())
      tgt.addLink(convertTestScriptMetadataLinkComponent(t));
    for (org.hl7.fhir.dstu2016may.model.TestScript.TestScriptMetadataCapabilityComponent t : src.getCapability())
      tgt.addCapability(convertTestScriptMetadataCapabilityComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.TestScript.TestScriptMetadataComponent convertTestScriptMetadataComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.TestScript.TestScriptMetadataComponent tgt = new org.hl7.fhir.dstu2016may.model.TestScript.TestScriptMetadataComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataLinkComponent t : src.getLink())
      tgt.addLink(convertTestScriptMetadataLinkComponent(t));
    for (org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataCapabilityComponent t : src.getCapability())
      tgt.addCapability(convertTestScriptMetadataCapabilityComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataLinkComponent convertTestScriptMetadataLinkComponent(org.hl7.fhir.dstu2016may.model.TestScript.TestScriptMetadataLinkComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataLinkComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataLinkComponent();
    copyElement(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setDescription(src.getDescription());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.TestScript.TestScriptMetadataLinkComponent convertTestScriptMetadataLinkComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataLinkComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.TestScript.TestScriptMetadataLinkComponent tgt = new org.hl7.fhir.dstu2016may.model.TestScript.TestScriptMetadataLinkComponent();
    copyElement(src, tgt);
    tgt.setUrl(src.getUrl());
    tgt.setDescription(src.getDescription());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataCapabilityComponent convertTestScriptMetadataCapabilityComponent(org.hl7.fhir.dstu2016may.model.TestScript.TestScriptMetadataCapabilityComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataCapabilityComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataCapabilityComponent();
    copyElement(src, tgt);
    tgt.setRequired(src.getRequired());
    tgt.setValidated(src.getValidated());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2016may.model.IntegerType t : src.getOrigin())
      tgt.addOrigin(t.getValue());
    tgt.setDestination(src.getDestination());
    for (org.hl7.fhir.dstu2016may.model.UriType t : src.getLink())
      tgt.addLink(t.getValue());
    tgt.setConformance(convertReference(src.getConformance()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.TestScript.TestScriptMetadataCapabilityComponent convertTestScriptMetadataCapabilityComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptMetadataCapabilityComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.TestScript.TestScriptMetadataCapabilityComponent tgt = new org.hl7.fhir.dstu2016may.model.TestScript.TestScriptMetadataCapabilityComponent();
    copyElement(src, tgt);
    tgt.setRequired(src.getRequired());
    tgt.setValidated(src.getValidated());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.IntegerType t : src.getOrigin())
      tgt.addOrigin(t.getValue());
    tgt.setDestination(src.getDestination());
    for (org.hl7.fhir.dstu3.model.UriType t : src.getLink())
      tgt.addLink(t.getValue());
    tgt.setConformance(convertReference(src.getConformance()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptFixtureComponent convertTestScriptFixtureComponent(org.hl7.fhir.dstu2016may.model.TestScript.TestScriptFixtureComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptFixtureComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptFixtureComponent();
    copyElement(src, tgt);
    tgt.setAutocreate(src.getAutocreate());
    tgt.setAutodelete(src.getAutodelete());
    tgt.setResource(convertReference(src.getResource()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.TestScript.TestScriptFixtureComponent convertTestScriptFixtureComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptFixtureComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.TestScript.TestScriptFixtureComponent tgt = new org.hl7.fhir.dstu2016may.model.TestScript.TestScriptFixtureComponent();
    copyElement(src, tgt);
    tgt.setAutocreate(src.getAutocreate());
    tgt.setAutodelete(src.getAutodelete());
    tgt.setResource(convertReference(src.getResource()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptVariableComponent convertTestScriptVariableComponent(org.hl7.fhir.dstu2016may.model.TestScript.TestScriptVariableComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptVariableComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptVariableComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setDefaultValue(src.getDefaultValue());
    tgt.setHeaderField(src.getHeaderField());
    tgt.setPath(src.getPath());
    tgt.setSourceId(src.getSourceId());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.TestScript.TestScriptVariableComponent convertTestScriptVariableComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptVariableComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.TestScript.TestScriptVariableComponent tgt = new org.hl7.fhir.dstu2016may.model.TestScript.TestScriptVariableComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setDefaultValue(src.getDefaultValue());
    tgt.setHeaderField(src.getHeaderField());
    tgt.setPath(src.getPath());
    tgt.setSourceId(src.getSourceId());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptRuleComponent convertTestScriptRuleComponent(org.hl7.fhir.dstu2016may.model.TestScript.TestScriptRuleComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptRuleComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptRuleComponent();
    copyElement(src, tgt);
    tgt.setResource(convertReference(src.getResource()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.TestScript.TestScriptRuleComponent convertTestScriptRuleComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptRuleComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.TestScript.TestScriptRuleComponent tgt = new org.hl7.fhir.dstu2016may.model.TestScript.TestScriptRuleComponent();
    copyElement(src, tgt);
    tgt.setResource(convertReference(src.getResource()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptRulesetComponent convertTestScriptRulesetComponent(org.hl7.fhir.dstu2016may.model.TestScript.TestScriptRulesetComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptRulesetComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptRulesetComponent();
    copyElement(src, tgt);
    tgt.setResource(convertReference(src.getResource()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.TestScript.TestScriptRulesetComponent convertTestScriptRulesetComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptRulesetComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.TestScript.TestScriptRulesetComponent tgt = new org.hl7.fhir.dstu2016may.model.TestScript.TestScriptRulesetComponent();
    copyElement(src, tgt);
    tgt.setResource(convertReference(src.getResource()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptSetupComponent convertTestScriptSetupComponent(org.hl7.fhir.dstu2016may.model.TestScript.TestScriptSetupComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptSetupComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptSetupComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2016may.model.TestScript.SetupActionComponent t : src.getAction())
      tgt.addAction(convertSetupActionComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.TestScript.TestScriptSetupComponent convertTestScriptSetupComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptSetupComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.TestScript.TestScriptSetupComponent tgt = new org.hl7.fhir.dstu2016may.model.TestScript.TestScriptSetupComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.TestScript.SetupActionComponent t : src.getAction())
      tgt.addAction(convertSetupActionComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.SetupActionComponent convertSetupActionComponent(org.hl7.fhir.dstu2016may.model.TestScript.SetupActionComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.TestScript.SetupActionComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.SetupActionComponent();
    copyElement(src, tgt);
    tgt.setOperation(convertSetupActionOperationComponent(src.getOperation()));
    tgt.setAssert(convertSetupActionAssertComponent(src.getAssert()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.TestScript.SetupActionComponent convertSetupActionComponent(org.hl7.fhir.dstu3.model.TestScript.SetupActionComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.TestScript.SetupActionComponent tgt = new org.hl7.fhir.dstu2016may.model.TestScript.SetupActionComponent();
    copyElement(src, tgt);
    tgt.setOperation(convertSetupActionOperationComponent(src.getOperation()));
    tgt.setAssert(convertSetupActionAssertComponent(src.getAssert()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.SetupActionOperationComponent convertSetupActionOperationComponent(org.hl7.fhir.dstu2016may.model.TestScript.SetupActionOperationComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.TestScript.SetupActionOperationComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.SetupActionOperationComponent();
    copyElement(src, tgt);
    tgt.setType(convertCoding(src.getType()));
    tgt.setResource(src.getResource());
    tgt.setLabel(src.getLabel());
    tgt.setDescription(src.getDescription());
    tgt.setAccept(convertContentType(src.getAccept()));
    tgt.setContentType(convertContentType(src.getContentType()));
    tgt.setDestination(src.getDestination());
    tgt.setEncodeRequestUrl(src.getEncodeRequestUrl());
    tgt.setOrigin(src.getOrigin());
    tgt.setParams(src.getParams());
    for (org.hl7.fhir.dstu2016may.model.TestScript.SetupActionOperationRequestHeaderComponent t : src.getRequestHeader())
      tgt.addRequestHeader(convertSetupActionOperationRequestHeaderComponent(t));
    tgt.setResponseId(src.getResponseId());
    tgt.setSourceId(src.getSourceId());
    tgt.setTargetId(src.getTargetId());
    tgt.setUrl(src.getUrl());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.TestScript.SetupActionOperationComponent convertSetupActionOperationComponent(org.hl7.fhir.dstu3.model.TestScript.SetupActionOperationComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.TestScript.SetupActionOperationComponent tgt = new org.hl7.fhir.dstu2016may.model.TestScript.SetupActionOperationComponent();
    copyElement(src, tgt);
    tgt.setType(convertCoding(src.getType()));
    tgt.setResource(src.getResource());
    tgt.setLabel(src.getLabel());
    tgt.setDescription(src.getDescription());
    tgt.setAccept(convertContentType(src.getAccept()));
    tgt.setContentType(convertContentType(src.getContentType()));
    tgt.setDestination(src.getDestination());
    tgt.setEncodeRequestUrl(src.getEncodeRequestUrl());
    tgt.setOrigin(src.getOrigin());
    tgt.setParams(src.getParams());
    for (org.hl7.fhir.dstu3.model.TestScript.SetupActionOperationRequestHeaderComponent t : src.getRequestHeader())
      tgt.addRequestHeader(convertSetupActionOperationRequestHeaderComponent(t));
    tgt.setResponseId(src.getResponseId());
    tgt.setSourceId(src.getSourceId());
    tgt.setTargetId(src.getTargetId());
    tgt.setUrl(src.getUrl());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.TestScript.ContentType convertContentType(org.hl7.fhir.dstu2016may.model.TestScript.ContentType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case XML: return org.hl7.fhir.dstu3.model.TestScript.ContentType.XML;
    case JSON: return org.hl7.fhir.dstu3.model.TestScript.ContentType.JSON;
    default: return org.hl7.fhir.dstu3.model.TestScript.ContentType.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.TestScript.ContentType convertContentType(org.hl7.fhir.dstu3.model.TestScript.ContentType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case XML: return org.hl7.fhir.dstu2016may.model.TestScript.ContentType.XML;
    case JSON: return org.hl7.fhir.dstu2016may.model.TestScript.ContentType.JSON;
    default: return org.hl7.fhir.dstu2016may.model.TestScript.ContentType.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.TestScript.SetupActionOperationRequestHeaderComponent convertSetupActionOperationRequestHeaderComponent(org.hl7.fhir.dstu2016may.model.TestScript.SetupActionOperationRequestHeaderComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.TestScript.SetupActionOperationRequestHeaderComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.SetupActionOperationRequestHeaderComponent();
    copyElement(src, tgt);
    tgt.setField(src.getField());
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.TestScript.SetupActionOperationRequestHeaderComponent convertSetupActionOperationRequestHeaderComponent(org.hl7.fhir.dstu3.model.TestScript.SetupActionOperationRequestHeaderComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.TestScript.SetupActionOperationRequestHeaderComponent tgt = new org.hl7.fhir.dstu2016may.model.TestScript.SetupActionOperationRequestHeaderComponent();
    copyElement(src, tgt);
    tgt.setField(src.getField());
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertComponent convertSetupActionAssertComponent(org.hl7.fhir.dstu2016may.model.TestScript.SetupActionAssertComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertComponent();
    copyElement(src, tgt);
    tgt.setLabel(src.getLabel());
    tgt.setDescription(src.getDescription());
    tgt.setDirection(convertAssertionDirectionType(src.getDirection()));
    tgt.setCompareToSourceId(src.getCompareToSourceId());
    tgt.setCompareToSourcePath(src.getCompareToSourcePath());
    tgt.setContentType(convertContentType(src.getContentType()));
    tgt.setHeaderField(src.getHeaderField());
    tgt.setMinimumId(src.getMinimumId());
    tgt.setNavigationLinks(src.getNavigationLinks());
    tgt.setOperator(convertAssertionOperatorType(src.getOperator()));
    tgt.setPath(src.getPath());
    tgt.setResource(src.getResource());
    tgt.setResponse(convertAssertionResponseTypes(src.getResponse()));
    tgt.setResponseCode(src.getResponseCode());
    tgt.setSourceId(src.getSourceId());
    tgt.setValidateProfileId(src.getValidateProfileId());
    tgt.setValue(src.getValue());
    tgt.setWarningOnly(src.getWarningOnly());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.TestScript.SetupActionAssertComponent convertSetupActionAssertComponent(org.hl7.fhir.dstu3.model.TestScript.SetupActionAssertComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.TestScript.SetupActionAssertComponent tgt = new org.hl7.fhir.dstu2016may.model.TestScript.SetupActionAssertComponent();
    copyElement(src, tgt);
    tgt.setLabel(src.getLabel());
    tgt.setDescription(src.getDescription());
    tgt.setDirection(convertAssertionDirectionType(src.getDirection()));
    tgt.setCompareToSourceId(src.getCompareToSourceId());
    tgt.setCompareToSourcePath(src.getCompareToSourcePath());
    tgt.setContentType(convertContentType(src.getContentType()));
    tgt.setHeaderField(src.getHeaderField());
    tgt.setMinimumId(src.getMinimumId());
    tgt.setNavigationLinks(src.getNavigationLinks());
    tgt.setOperator(convertAssertionOperatorType(src.getOperator()));
    tgt.setPath(src.getPath());
    tgt.setResource(src.getResource());
    tgt.setResponse(convertAssertionResponseTypes(src.getResponse()));
    tgt.setResponseCode(src.getResponseCode());
    tgt.setSourceId(src.getSourceId());
    tgt.setValidateProfileId(src.getValidateProfileId());
    tgt.setValue(src.getValue());
    tgt.setWarningOnly(src.getWarningOnly());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.TestScript.AssertionDirectionType convertAssertionDirectionType(org.hl7.fhir.dstu2016may.model.TestScript.AssertionDirectionType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case RESPONSE: return org.hl7.fhir.dstu3.model.TestScript.AssertionDirectionType.RESPONSE;
    case REQUEST: return org.hl7.fhir.dstu3.model.TestScript.AssertionDirectionType.REQUEST;
    default: return org.hl7.fhir.dstu3.model.TestScript.AssertionDirectionType.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.TestScript.AssertionDirectionType convertAssertionDirectionType(org.hl7.fhir.dstu3.model.TestScript.AssertionDirectionType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case RESPONSE: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionDirectionType.RESPONSE;
    case REQUEST: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionDirectionType.REQUEST;
    default: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionDirectionType.NULL;
    }
  }

  private static org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType convertAssertionOperatorType(org.hl7.fhir.dstu2016may.model.TestScript.AssertionOperatorType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case EQUALS: return org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType.EQUALS;
    case NOTEQUALS: return org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType.NOTEQUALS;
    case IN: return org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType.IN;
    case NOTIN: return org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType.NOTIN;
    case GREATERTHAN: return org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType.GREATERTHAN;
    case LESSTHAN: return org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType.LESSTHAN;
    case EMPTY: return org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType.EMPTY;
    case NOTEMPTY: return org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType.NOTEMPTY;
    case CONTAINS: return org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType.CONTAINS;
    case NOTCONTAINS: return org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType.NOTCONTAINS;
    default: return org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.TestScript.AssertionOperatorType convertAssertionOperatorType(org.hl7.fhir.dstu3.model.TestScript.AssertionOperatorType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case EQUALS: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionOperatorType.EQUALS;
    case NOTEQUALS: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionOperatorType.NOTEQUALS;
    case IN: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionOperatorType.IN;
    case NOTIN: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionOperatorType.NOTIN;
    case GREATERTHAN: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionOperatorType.GREATERTHAN;
    case LESSTHAN: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionOperatorType.LESSTHAN;
    case EMPTY: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionOperatorType.EMPTY;
    case NOTEMPTY: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionOperatorType.NOTEMPTY;
    case CONTAINS: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionOperatorType.CONTAINS;
    case NOTCONTAINS: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionOperatorType.NOTCONTAINS;
    default: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionOperatorType.NULL;
    }
  }

  private static org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes convertAssertionResponseTypes(org.hl7.fhir.dstu2016may.model.TestScript.AssertionResponseTypes src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case OKAY: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.OKAY;
    case CREATED: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.CREATED;
    case NOCONTENT: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.NOCONTENT;
    case NOTMODIFIED: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.NOTMODIFIED;
    case BAD: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.BAD;
    case FORBIDDEN: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.FORBIDDEN;
    case NOTFOUND: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.NOTFOUND;
    case METHODNOTALLOWED: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.METHODNOTALLOWED;
    case CONFLICT: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.CONFLICT;
    case GONE: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.GONE;
    case PRECONDITIONFAILED: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.PRECONDITIONFAILED;
    case UNPROCESSABLE: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.UNPROCESSABLE;
    default: return org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.TestScript.AssertionResponseTypes convertAssertionResponseTypes(org.hl7.fhir.dstu3.model.TestScript.AssertionResponseTypes src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case OKAY: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionResponseTypes.OKAY;
    case CREATED: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionResponseTypes.CREATED;
    case NOCONTENT: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionResponseTypes.NOCONTENT;
    case NOTMODIFIED: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionResponseTypes.NOTMODIFIED;
    case BAD: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionResponseTypes.BAD;
    case FORBIDDEN: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionResponseTypes.FORBIDDEN;
    case NOTFOUND: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionResponseTypes.NOTFOUND;
    case METHODNOTALLOWED: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionResponseTypes.METHODNOTALLOWED;
    case CONFLICT: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionResponseTypes.CONFLICT;
    case GONE: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionResponseTypes.GONE;
    case PRECONDITIONFAILED: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionResponseTypes.PRECONDITIONFAILED;
    case UNPROCESSABLE: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionResponseTypes.UNPROCESSABLE;
    default: return org.hl7.fhir.dstu2016may.model.TestScript.AssertionResponseTypes.NULL;
    }
  }


  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptTestComponent convertTestScriptTestComponent(org.hl7.fhir.dstu2016may.model.TestScript.TestScriptTestComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptTestComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptTestComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2016may.model.TestScript.TestActionComponent t : src.getAction())
      tgt.addAction(convertTestActionComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.TestScript.TestScriptTestComponent convertTestScriptTestComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptTestComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.TestScript.TestScriptTestComponent tgt = new org.hl7.fhir.dstu2016may.model.TestScript.TestScriptTestComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.TestScript.TestActionComponent t : src.getAction())
      tgt.addAction(convertTestActionComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestActionComponent convertTestActionComponent(org.hl7.fhir.dstu2016may.model.TestScript.TestActionComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestActionComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestActionComponent();
    copyElement(src, tgt);
    tgt.setOperation(convertSetupActionOperationComponent(src.getOperation()));
    tgt.setAssert(convertSetupActionAssertComponent(src.getAssert()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.TestScript.TestActionComponent convertTestActionComponent(org.hl7.fhir.dstu3.model.TestScript.TestActionComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.TestScript.TestActionComponent tgt = new org.hl7.fhir.dstu2016may.model.TestScript.TestActionComponent();
    copyElement(src, tgt);
    tgt.setOperation(convertSetupActionOperationComponent(src.getOperation()));
    tgt.setAssert(convertSetupActionAssertComponent(src.getAssert()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TestScriptTeardownComponent convertTestScriptTeardownComponent(org.hl7.fhir.dstu2016may.model.TestScript.TestScriptTeardownComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TestScriptTeardownComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TestScriptTeardownComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2016may.model.TestScript.TeardownActionComponent t : src.getAction())
      tgt.addAction(convertTeardownActionComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.TestScript.TestScriptTeardownComponent convertTestScriptTeardownComponent(org.hl7.fhir.dstu3.model.TestScript.TestScriptTeardownComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.TestScript.TestScriptTeardownComponent tgt = new org.hl7.fhir.dstu2016may.model.TestScript.TestScriptTeardownComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.TestScript.TeardownActionComponent t : src.getAction())
      tgt.addAction(convertTeardownActionComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.TestScript.TeardownActionComponent convertTeardownActionComponent(org.hl7.fhir.dstu2016may.model.TestScript.TeardownActionComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.TestScript.TeardownActionComponent tgt = new org.hl7.fhir.dstu3.model.TestScript.TeardownActionComponent();
    copyElement(src, tgt);
    tgt.setOperation(convertSetupActionOperationComponent(src.getOperation()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.TestScript.TeardownActionComponent convertTeardownActionComponent(org.hl7.fhir.dstu3.model.TestScript.TeardownActionComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.TestScript.TeardownActionComponent tgt = new org.hl7.fhir.dstu2016may.model.TestScript.TeardownActionComponent();
    copyElement(src, tgt);
    tgt.setOperation(convertSetupActionOperationComponent(src.getOperation()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ValueSet convertValueSet(org.hl7.fhir.dstu2016may.model.ValueSet src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ValueSet tgt = new org.hl7.fhir.dstu3.model.ValueSet();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    if (src.hasIdentifier())
      tgt.addIdentifier(convertIdentifier(src.getIdentifier()));
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetContactComponent t : src.getContact())
      tgt.addContact(convertValueSetContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setLockedDate(src.getLockedDate());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu2016may.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setImmutable(src.getImmutable());
    tgt.setRequirements(src.getRequirements());
    tgt.setCopyright(src.getCopyright());
    tgt.setExtensible(src.getExtensible());
    tgt.setCompose(convertValueSetComposeComponent(src.getCompose()));
    tgt.setExpansion(convertValueSetExpansionComponent(src.getExpansion()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ValueSet convertValueSet(org.hl7.fhir.dstu3.model.ValueSet src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ValueSet tgt = new org.hl7.fhir.dstu2016may.model.ValueSet();
    copyDomainResource(src, tgt);
    tgt.setUrl(src.getUrl());
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.setIdentifier(convertIdentifier(t));
    tgt.setVersion(src.getVersion());
    tgt.setName(src.getName());
    tgt.setStatus(convertConformanceResourceStatus(src.getStatus()));
    tgt.setExperimental(src.getExperimental());
    tgt.setPublisher(src.getPublisher());
    for (org.hl7.fhir.dstu3.model.ValueSet.ValueSetContactComponent t : src.getContact())
      tgt.addContact(convertValueSetContactComponent(t));
    tgt.setDate(src.getDate());
    tgt.setLockedDate(src.getLockedDate());
    tgt.setDescription(src.getDescription());
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getUseContext())
      tgt.addUseContext(convertCodeableConcept(t));
    tgt.setImmutable(src.getImmutable());
    tgt.setRequirements(src.getRequirements());
    tgt.setCopyright(src.getCopyright());
    tgt.setExtensible(src.getExtensible());
    tgt.setCompose(convertValueSetComposeComponent(src.getCompose()));
    tgt.setExpansion(convertValueSetExpansionComponent(src.getExpansion()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ValueSet.ValueSetContactComponent convertValueSetContactComponent(org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ValueSet.ValueSetContactComponent tgt = new org.hl7.fhir.dstu3.model.ValueSet.ValueSetContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu2016may.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetContactComponent convertValueSetContactComponent(org.hl7.fhir.dstu3.model.ValueSet.ValueSetContactComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetContactComponent tgt = new org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetContactComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(convertContactPoint(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ValueSet.ValueSetComposeComponent convertValueSetComposeComponent(org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetComposeComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ValueSet.ValueSetComposeComponent tgt = new org.hl7.fhir.dstu3.model.ValueSet.ValueSetComposeComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu2016may.model.UriType t : src.getImport())
      tgt.addImport(t.getValue());
    for (org.hl7.fhir.dstu2016may.model.ValueSet.ConceptSetComponent t : src.getInclude())
      tgt.addInclude(convertConceptSetComponent(t));
    for (org.hl7.fhir.dstu2016may.model.ValueSet.ConceptSetComponent t : src.getExclude())
      tgt.addExclude(convertConceptSetComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetComposeComponent convertValueSetComposeComponent(org.hl7.fhir.dstu3.model.ValueSet.ValueSetComposeComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetComposeComponent tgt = new org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetComposeComponent();
    copyElement(src, tgt);
    for (org.hl7.fhir.dstu3.model.UriType t : src.getImport())
      tgt.addImport(t.getValue());
    for (org.hl7.fhir.dstu3.model.ValueSet.ConceptSetComponent t : src.getInclude())
      tgt.addInclude(convertConceptSetComponent(t));
    for (org.hl7.fhir.dstu3.model.ValueSet.ConceptSetComponent t : src.getExclude())
      tgt.addExclude(convertConceptSetComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ValueSet.ConceptSetComponent convertConceptSetComponent(org.hl7.fhir.dstu2016may.model.ValueSet.ConceptSetComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ValueSet.ConceptSetComponent tgt = new org.hl7.fhir.dstu3.model.ValueSet.ConceptSetComponent();
    copyElement(src, tgt);
    tgt.setSystem(src.getSystem());
    tgt.setVersion(src.getVersion());
    for (org.hl7.fhir.dstu2016may.model.ValueSet.ConceptReferenceComponent t : src.getConcept())
      tgt.addConcept(convertConceptReferenceComponent(t));
    for (org.hl7.fhir.dstu2016may.model.ValueSet.ConceptSetFilterComponent t : src.getFilter())
      tgt.addFilter(convertConceptSetFilterComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ValueSet.ConceptSetComponent convertConceptSetComponent(org.hl7.fhir.dstu3.model.ValueSet.ConceptSetComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ValueSet.ConceptSetComponent tgt = new org.hl7.fhir.dstu2016may.model.ValueSet.ConceptSetComponent();
    copyElement(src, tgt);
    tgt.setSystem(src.getSystem());
    tgt.setVersion(src.getVersion());
    for (org.hl7.fhir.dstu3.model.ValueSet.ConceptReferenceComponent t : src.getConcept())
      tgt.addConcept(convertConceptReferenceComponent(t));
    for (org.hl7.fhir.dstu3.model.ValueSet.ConceptSetFilterComponent t : src.getFilter())
      tgt.addFilter(convertConceptSetFilterComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ValueSet.ConceptReferenceComponent convertConceptReferenceComponent(org.hl7.fhir.dstu2016may.model.ValueSet.ConceptReferenceComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ValueSet.ConceptReferenceComponent tgt = new org.hl7.fhir.dstu3.model.ValueSet.ConceptReferenceComponent();
    copyElement(src, tgt);
    tgt.setCode(src.getCode());
    tgt.setDisplay(src.getDisplay());
    for (org.hl7.fhir.dstu2016may.model.ValueSet.ConceptReferenceDesignationComponent t : src.getDesignation())
      tgt.addDesignation(convertConceptReferenceDesignationComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ValueSet.ConceptReferenceComponent convertConceptReferenceComponent(org.hl7.fhir.dstu3.model.ValueSet.ConceptReferenceComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ValueSet.ConceptReferenceComponent tgt = new org.hl7.fhir.dstu2016may.model.ValueSet.ConceptReferenceComponent();
    copyElement(src, tgt);
    tgt.setCode(src.getCode());
    tgt.setDisplay(src.getDisplay());
    for (org.hl7.fhir.dstu3.model.ValueSet.ConceptReferenceDesignationComponent t : src.getDesignation())
      tgt.addDesignation(convertConceptReferenceDesignationComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ValueSet.ConceptReferenceDesignationComponent convertConceptReferenceDesignationComponent(org.hl7.fhir.dstu2016may.model.ValueSet.ConceptReferenceDesignationComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ValueSet.ConceptReferenceDesignationComponent tgt = new org.hl7.fhir.dstu3.model.ValueSet.ConceptReferenceDesignationComponent();
    copyElement(src, tgt);
    tgt.setLanguage(src.getLanguage());
    tgt.setUse(convertCoding(src.getUse()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ValueSet.ConceptReferenceDesignationComponent convertConceptReferenceDesignationComponent(org.hl7.fhir.dstu3.model.ValueSet.ConceptReferenceDesignationComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ValueSet.ConceptReferenceDesignationComponent tgt = new org.hl7.fhir.dstu2016may.model.ValueSet.ConceptReferenceDesignationComponent();
    copyElement(src, tgt);
    tgt.setLanguage(src.getLanguage());
    tgt.setUse(convertCoding(src.getUse()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ValueSet.ConceptSetFilterComponent convertConceptSetFilterComponent(org.hl7.fhir.dstu2016may.model.ValueSet.ConceptSetFilterComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ValueSet.ConceptSetFilterComponent tgt = new org.hl7.fhir.dstu3.model.ValueSet.ConceptSetFilterComponent();
    copyElement(src, tgt);
    tgt.setProperty(src.getProperty());
    tgt.setOp(convertFilterOperator(src.getOp()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ValueSet.ConceptSetFilterComponent convertConceptSetFilterComponent(org.hl7.fhir.dstu3.model.ValueSet.ConceptSetFilterComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ValueSet.ConceptSetFilterComponent tgt = new org.hl7.fhir.dstu2016may.model.ValueSet.ConceptSetFilterComponent();
    copyElement(src, tgt);
    tgt.setProperty(src.getProperty());
    tgt.setOp(convertFilterOperator(src.getOp()));
    tgt.setValue(src.getValue());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.ValueSet.FilterOperator convertFilterOperator(org.hl7.fhir.dstu2016may.model.ValueSet.FilterOperator src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case EQUAL: return org.hl7.fhir.dstu3.model.ValueSet.FilterOperator.EQUAL;
    case ISA: return org.hl7.fhir.dstu3.model.ValueSet.FilterOperator.ISA;
    case ISNOTA: return org.hl7.fhir.dstu3.model.ValueSet.FilterOperator.ISNOTA;
    case REGEX: return org.hl7.fhir.dstu3.model.ValueSet.FilterOperator.REGEX;
    case IN: return org.hl7.fhir.dstu3.model.ValueSet.FilterOperator.IN;
    case NOTIN: return org.hl7.fhir.dstu3.model.ValueSet.FilterOperator.NOTIN;
    default: return org.hl7.fhir.dstu3.model.ValueSet.FilterOperator.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.ValueSet.FilterOperator convertFilterOperator(org.hl7.fhir.dstu3.model.ValueSet.FilterOperator src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case EQUAL: return org.hl7.fhir.dstu2016may.model.ValueSet.FilterOperator.EQUAL;
    case ISA: return org.hl7.fhir.dstu2016may.model.ValueSet.FilterOperator.ISA;
    case ISNOTA: return org.hl7.fhir.dstu2016may.model.ValueSet.FilterOperator.ISNOTA;
    case REGEX: return org.hl7.fhir.dstu2016may.model.ValueSet.FilterOperator.REGEX;
    case IN: return org.hl7.fhir.dstu2016may.model.ValueSet.FilterOperator.IN;
    case NOTIN: return org.hl7.fhir.dstu2016may.model.ValueSet.FilterOperator.NOTIN;
    default: return org.hl7.fhir.dstu2016may.model.ValueSet.FilterOperator.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionComponent convertValueSetExpansionComponent(org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetExpansionComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionComponent tgt = new org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionComponent();
    copyElement(src, tgt);
    tgt.setIdentifier(src.getIdentifier());
    tgt.setTimestamp(src.getTimestamp());
    tgt.setTotal(src.getTotal());
    tgt.setOffset(src.getOffset());
    for (org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetExpansionParameterComponent t : src.getParameter())
      tgt.addParameter(convertValueSetExpansionParameterComponent(t));
    for (org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetExpansionContainsComponent t : src.getContains())
      tgt.addContains(convertValueSetExpansionContainsComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetExpansionComponent convertValueSetExpansionComponent(org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetExpansionComponent tgt = new org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetExpansionComponent();
    copyElement(src, tgt);
    tgt.setIdentifier(src.getIdentifier());
    tgt.setTimestamp(src.getTimestamp());
    tgt.setTotal(src.getTotal());
    tgt.setOffset(src.getOffset());
    for (org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionParameterComponent t : src.getParameter())
      tgt.addParameter(convertValueSetExpansionParameterComponent(t));
    for (org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionContainsComponent t : src.getContains())
      tgt.addContains(convertValueSetExpansionContainsComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionParameterComponent convertValueSetExpansionParameterComponent(org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetExpansionParameterComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionParameterComponent tgt = new org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionParameterComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setValue(convertType(src.getValue()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetExpansionParameterComponent convertValueSetExpansionParameterComponent(org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionParameterComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetExpansionParameterComponent tgt = new org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetExpansionParameterComponent();
    copyElement(src, tgt);
    tgt.setName(src.getName());
    tgt.setValue(convertType(src.getValue()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionContainsComponent convertValueSetExpansionContainsComponent(org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetExpansionContainsComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionContainsComponent tgt = new org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionContainsComponent();
    copyElement(src, tgt);
    tgt.setSystem(src.getSystem());
    tgt.setAbstract(src.getAbstract());
    tgt.setVersion(src.getVersion());
    tgt.setCode(src.getCode());
    tgt.setDisplay(src.getDisplay());
    for (org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetExpansionContainsComponent t : src.getContains())
      tgt.addContains(convertValueSetExpansionContainsComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetExpansionContainsComponent convertValueSetExpansionContainsComponent(org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionContainsComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetExpansionContainsComponent tgt = new org.hl7.fhir.dstu2016may.model.ValueSet.ValueSetExpansionContainsComponent();
    copyElement(src, tgt);
    tgt.setSystem(src.getSystem());
    tgt.setAbstract(src.getAbstract());
    tgt.setVersion(src.getVersion());
    tgt.setCode(src.getCode());
    tgt.setDisplay(src.getDisplay());
    for (org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionContainsComponent t : src.getContains())
      tgt.addContains(convertValueSetExpansionContainsComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.VisionPrescription convertVisionPrescription(org.hl7.fhir.dstu2016may.model.VisionPrescription src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.VisionPrescription tgt = new org.hl7.fhir.dstu3.model.VisionPrescription();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2016may.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setDateWritten(src.getDateWritten());
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setPrescriber(convertReference(src.getPrescriber()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setReason(convertType(src.getReason()));
    for (org.hl7.fhir.dstu2016may.model.VisionPrescription.VisionPrescriptionDispenseComponent t : src.getDispense())
      tgt.addDispense(convertVisionPrescriptionDispenseComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.VisionPrescription convertVisionPrescription(org.hl7.fhir.dstu3.model.VisionPrescription src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.VisionPrescription tgt = new org.hl7.fhir.dstu2016may.model.VisionPrescription();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    tgt.setDateWritten(src.getDateWritten());
    tgt.setPatient(convertReference(src.getPatient()));
    tgt.setPrescriber(convertReference(src.getPrescriber()));
    tgt.setEncounter(convertReference(src.getEncounter()));
    tgt.setReason(convertType(src.getReason()));
    for (org.hl7.fhir.dstu3.model.VisionPrescription.VisionPrescriptionDispenseComponent t : src.getDispense())
      tgt.addDispense(convertVisionPrescriptionDispenseComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.VisionPrescription.VisionPrescriptionDispenseComponent convertVisionPrescriptionDispenseComponent(org.hl7.fhir.dstu2016may.model.VisionPrescription.VisionPrescriptionDispenseComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.VisionPrescription.VisionPrescriptionDispenseComponent tgt = new org.hl7.fhir.dstu3.model.VisionPrescription.VisionPrescriptionDispenseComponent();
    copyElement(src, tgt);
    tgt.setProduct(convertCoding(src.getProduct()));
    tgt.setEye(convertVisionEyes(src.getEye()));
    tgt.setSphere(src.getSphere());
    tgt.setCylinder(src.getCylinder());
    tgt.setAxis(src.getAxis());
    tgt.setPrism(src.getPrism());
    tgt.setBase(convertVisionBase(src.getBase()));
    tgt.setAdd(src.getAdd());
    tgt.setPower(src.getPower());
    tgt.setBackCurve(src.getBackCurve());
    tgt.setDiameter(src.getDiameter());
    tgt.setDuration(convertSimpleQuantity(src.getDuration()));
    tgt.setColor(src.getColor());
    tgt.setBrand(src.getBrand());
    tgt.setNotes(src.getNotes());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.VisionPrescription.VisionPrescriptionDispenseComponent convertVisionPrescriptionDispenseComponent(org.hl7.fhir.dstu3.model.VisionPrescription.VisionPrescriptionDispenseComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.VisionPrescription.VisionPrescriptionDispenseComponent tgt = new org.hl7.fhir.dstu2016may.model.VisionPrescription.VisionPrescriptionDispenseComponent();
    copyElement(src, tgt);
    tgt.setProduct(convertCoding(src.getProduct()));
    tgt.setEye(convertVisionEyes(src.getEye()));
    tgt.setSphere(src.getSphere());
    tgt.setCylinder(src.getCylinder());
    tgt.setAxis(src.getAxis());
    tgt.setPrism(src.getPrism());
    tgt.setBase(convertVisionBase(src.getBase()));
    tgt.setAdd(src.getAdd());
    tgt.setPower(src.getPower());
    tgt.setBackCurve(src.getBackCurve());
    tgt.setDiameter(src.getDiameter());
    tgt.setDuration(convertSimpleQuantity(src.getDuration()));
    tgt.setColor(src.getColor());
    tgt.setBrand(src.getBrand());
    tgt.setNotes(src.getNotes());
    return tgt;
  }

  private static org.hl7.fhir.dstu3.model.VisionPrescription.VisionEyes convertVisionEyes(org.hl7.fhir.dstu2016may.model.VisionPrescription.VisionEyes src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case RIGHT: return org.hl7.fhir.dstu3.model.VisionPrescription.VisionEyes.RIGHT;
    case LEFT: return org.hl7.fhir.dstu3.model.VisionPrescription.VisionEyes.LEFT;
    default: return org.hl7.fhir.dstu3.model.VisionPrescription.VisionEyes.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.VisionPrescription.VisionEyes convertVisionEyes(org.hl7.fhir.dstu3.model.VisionPrescription.VisionEyes src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case RIGHT: return org.hl7.fhir.dstu2016may.model.VisionPrescription.VisionEyes.RIGHT;
    case LEFT: return org.hl7.fhir.dstu2016may.model.VisionPrescription.VisionEyes.LEFT;
    default: return org.hl7.fhir.dstu2016may.model.VisionPrescription.VisionEyes.NULL;
    }
  }

  private static org.hl7.fhir.dstu3.model.VisionPrescription.VisionBase convertVisionBase(org.hl7.fhir.dstu2016may.model.VisionPrescription.VisionBase src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case UP: return org.hl7.fhir.dstu3.model.VisionPrescription.VisionBase.UP;
    case DOWN: return org.hl7.fhir.dstu3.model.VisionPrescription.VisionBase.DOWN;
    case IN: return org.hl7.fhir.dstu3.model.VisionPrescription.VisionBase.IN;
    case OUT: return org.hl7.fhir.dstu3.model.VisionPrescription.VisionBase.OUT;
    default: return org.hl7.fhir.dstu3.model.VisionPrescription.VisionBase.NULL;
    }
  }

  private static org.hl7.fhir.dstu2016may.model.VisionPrescription.VisionBase convertVisionBase(org.hl7.fhir.dstu3.model.VisionPrescription.VisionBase src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case UP: return org.hl7.fhir.dstu2016may.model.VisionPrescription.VisionBase.UP;
    case DOWN: return org.hl7.fhir.dstu2016may.model.VisionPrescription.VisionBase.DOWN;
    case IN: return org.hl7.fhir.dstu2016may.model.VisionPrescription.VisionBase.IN;
    case OUT: return org.hl7.fhir.dstu2016may.model.VisionPrescription.VisionBase.OUT;
    default: return org.hl7.fhir.dstu2016may.model.VisionPrescription.VisionBase.NULL;
    }
  }

  public static org.hl7.fhir.dstu3.model.Resource convertResource(org.hl7.fhir.dstu2016may.model.Resource src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    if (src instanceof org.hl7.fhir.dstu2016may.model.Parameters)
      return convertParameters((org.hl7.fhir.dstu2016may.model.Parameters) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.Bundle)
      return convertBundle((org.hl7.fhir.dstu2016may.model.Bundle) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.CodeSystem)
      return convertCodeSystem((org.hl7.fhir.dstu2016may.model.CodeSystem) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.CompartmentDefinition)
      return convertCompartmentDefinition((org.hl7.fhir.dstu2016may.model.CompartmentDefinition) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.ConceptMap)
      return convertConceptMap((org.hl7.fhir.dstu2016may.model.ConceptMap) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.Conformance)
      return convertConformance((org.hl7.fhir.dstu2016may.model.Conformance) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.DataElement)
      return convertDataElement((org.hl7.fhir.dstu2016may.model.DataElement) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.ImplementationGuide)
      return convertImplementationGuide((org.hl7.fhir.dstu2016may.model.ImplementationGuide) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.NamingSystem)
      return convertNamingSystem((org.hl7.fhir.dstu2016may.model.NamingSystem) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.OperationDefinition)
      return convertOperationDefinition((org.hl7.fhir.dstu2016may.model.OperationDefinition) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.OperationOutcome)
      return convertOperationOutcome((org.hl7.fhir.dstu2016may.model.OperationOutcome) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.Questionnaire)
      return convertQuestionnaire((org.hl7.fhir.dstu2016may.model.Questionnaire) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.QuestionnaireResponse)
      return convertQuestionnaireResponse((org.hl7.fhir.dstu2016may.model.QuestionnaireResponse) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.SearchParameter)
      return convertSearchParameter((org.hl7.fhir.dstu2016may.model.SearchParameter) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.StructureDefinition)
      return convertStructureDefinition((org.hl7.fhir.dstu2016may.model.StructureDefinition) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.TestScript)
      return convertTestScript((org.hl7.fhir.dstu2016may.model.TestScript) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.ValueSet)
      return convertValueSet((org.hl7.fhir.dstu2016may.model.ValueSet) src);
    if (src instanceof org.hl7.fhir.dstu2016may.model.VisionPrescription)
      return convertVisionPrescription((org.hl7.fhir.dstu2016may.model.VisionPrescription) src);
    throw new Error("Unknown resource "+src.fhirType());
  }

  public static org.hl7.fhir.dstu2016may.model.Resource convertResource(org.hl7.fhir.dstu3.model.Resource src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    if (src instanceof org.hl7.fhir.dstu3.model.Parameters)
      return convertParameters((org.hl7.fhir.dstu3.model.Parameters) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Bundle)
      return convertBundle((org.hl7.fhir.dstu3.model.Bundle) src);
    if (src instanceof org.hl7.fhir.dstu3.model.CodeSystem)
      return convertCodeSystem((org.hl7.fhir.dstu3.model.CodeSystem) src);
    if (src instanceof org.hl7.fhir.dstu3.model.CompartmentDefinition)
      return convertCompartmentDefinition((org.hl7.fhir.dstu3.model.CompartmentDefinition) src);
    if (src instanceof org.hl7.fhir.dstu3.model.ConceptMap)
      return convertConceptMap((org.hl7.fhir.dstu3.model.ConceptMap) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Conformance)
      return convertConformance((org.hl7.fhir.dstu3.model.Conformance) src);
    if (src instanceof org.hl7.fhir.dstu3.model.DataElement)
      return convertDataElement((org.hl7.fhir.dstu3.model.DataElement) src);
    if (src instanceof org.hl7.fhir.dstu3.model.ImplementationGuide)
      return convertImplementationGuide((org.hl7.fhir.dstu3.model.ImplementationGuide) src);
    if (src instanceof org.hl7.fhir.dstu3.model.NamingSystem)
      return convertNamingSystem((org.hl7.fhir.dstu3.model.NamingSystem) src);
    if (src instanceof org.hl7.fhir.dstu3.model.OperationDefinition)
      return convertOperationDefinition((org.hl7.fhir.dstu3.model.OperationDefinition) src);
    if (src instanceof org.hl7.fhir.dstu3.model.OperationOutcome)
      return convertOperationOutcome((org.hl7.fhir.dstu3.model.OperationOutcome) src);
    if (src instanceof org.hl7.fhir.dstu3.model.Questionnaire)
      return convertQuestionnaire((org.hl7.fhir.dstu3.model.Questionnaire) src);
    if (src instanceof org.hl7.fhir.dstu3.model.QuestionnaireResponse)
      return convertQuestionnaireResponse((org.hl7.fhir.dstu3.model.QuestionnaireResponse) src);
    if (src instanceof org.hl7.fhir.dstu3.model.ReferralRequest)
    if (src instanceof org.hl7.fhir.dstu3.model.SearchParameter)
      return convertSearchParameter((org.hl7.fhir.dstu3.model.SearchParameter) src);
    if (src instanceof org.hl7.fhir.dstu3.model.StructureDefinition)
      return convertStructureDefinition((org.hl7.fhir.dstu3.model.StructureDefinition) src);
    if (src instanceof org.hl7.fhir.dstu3.model.TestScript)
      return convertTestScript((org.hl7.fhir.dstu3.model.TestScript) src);
    if (src instanceof org.hl7.fhir.dstu3.model.ValueSet)
      return convertValueSet((org.hl7.fhir.dstu3.model.ValueSet) src);
    if (src instanceof org.hl7.fhir.dstu3.model.VisionPrescription)
      return convertVisionPrescription((org.hl7.fhir.dstu3.model.VisionPrescription) src);
    throw new Error("Unknown resource "+src.fhirType());
  }


}
