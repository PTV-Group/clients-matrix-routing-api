/*
 * Matrix Routing
 *
 * With the Matrix Routing service you can compute distances and travel times between a set of origins and destinations.
 *
 * The version of the OpenAPI document: 1.5
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = PTV.Developer.Clients.matrixrouting.Client.OpenAPIDateConverter;

namespace PTV.Developer.Clients.matrixrouting.Model
{
    /// <summary>
    /// CausingError
    /// </summary>
    [DataContract(Name = "CausingError")]
    public partial class CausingError : IEquatable<CausingError>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CausingError" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CausingError() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CausingError" /> class.
        /// </summary>
        /// <param name="description">A human readable message that describes the error. (required).</param>
        /// <param name="errorCode">A constant string that can be used to identify this error class programmatically. An errorCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified. Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.  **Error codes for** &#x60;GENERAL_VALIDATION_ERROR&#x60;  * &#x60;GENERAL_INVALID_VALUE&#x60; - A parameter is set to an invalid value.   * &#x60;value&#x60; - The invalid value. * &#x60;GENERAL_UNRECOGNIZED_PARAMETER&#x60; - A parameter is unknown. * &#x60;GENERAL_MISSING_PARAMETER&#x60; - A required parameter is missing. * &#x60;GENERAL_MINIMUM_LENGTH_VIOLATED&#x60; - The minimum length is violated.   * &#x60;minimumLength&#x60; - The minimum length (integer). * &#x60;GENERAL_MAXIMUM_LENGTH_VIOLATED&#x60; - The maximum length is violated.   * &#x60;maximumLength&#x60; - The maximum length (integer). * &#x60;GENERAL_MINIMUM_VALUE_VIOLATED&#x60; - The minimum value restriction is violated.   * &#x60;minimumValue&#x60; - The minimum value (integer or double). * &#x60;GENERAL_MAXIMUM_VALUE_VIOLATED&#x60; - The maximum value restriction is violated.   * &#x60;maximumValue&#x60; - The maximum value (integer or double). * &#x60;GENERAL_DUPLICATE_PARAMETER&#x60; - A parameter is duplicated. * &#x60;GENERAL_INVALID_LIST&#x60; - A list has an invalid format such as duplicate commas.   * &#x60;value&#x60; - The invalid list. * &#x60;MATRIX_ROUTING_PROFILE_NOT_FOUND&#x60; - The requested profile could not be found.   * &#x60;value&#x60; - The invalid profile. * &#x60;MATRIX_ROUTING_UNSUPPORTED_CURRENCY&#x60; - The specified currency is not supported.   * &#x60;value&#x60; - The unsupported currency. * &#x60;MATRIX_ROUTING_TOO_MANY_RELATIONS&#x60; - The request contains too many relations.   * &#x60;limit&#x60;- The maximum allowed number of relations for a single request. * &#x60;MATRIX_ROUTING_LOCATIONS_TOO_FAR_AWAY&#x60; - Locations are too far away from each other.   * &#x60;limit&#x60;- All locations have to be inside a rectangle with edges of at most 500 km length. * &#x60;MATRIX_ROUTING_UNSUPPORTED_RESULT_OPTION&#x60; - The specified result option is not supported.   * &#x60;value&#x60; - The unsupported result option. * &#x60;MATRIX_ROUTING_UNSUPPORTED_PLAIN_RESULT_FORMAT_WITH_TRAVEL_TIME_PROFILES&#x60; - The travel time profiles cannot be requested in combination with the result format PLAIN. * &#x60;MATRIX_ROUTING_UNSUPPORTED_OPTIONS_WITH_SYNC&#x60; - This option is not supported with synchronous call. * &#x60;MATRIX_ROUTING_TRAVEL_TIMES_MUST_BE_REQUESTED&#x60; - The results should contain TRAVEL_TIMES. * &#x60;MATRIX_ROUTING_PARAMETER_CONFLICT&#x60; - Two parameters are in conflict with each other.   * &#x60;conflictingParameter&#x60; - The conflicting parameter.   * &#x60;message&#x60; - The error message. (required).</param>
        /// <param name="_parameter">The name of the affected query or path parameter or a JSONPath to the affected property of the request..</param>
        /// <param name="details">Additional properties specific to this error class..</param>
        public CausingError(string description = default(string), string errorCode = default(string), string _parameter = default(string), Dictionary<string, Object> details = default(Dictionary<string, Object>))
        {
            // to ensure "description" is required (not null)
            if (description == null)
            {
                throw new ArgumentNullException("description is a required property for CausingError and cannot be null");
            }
            this.Description = description;
            // to ensure "errorCode" is required (not null)
            if (errorCode == null)
            {
                throw new ArgumentNullException("errorCode is a required property for CausingError and cannot be null");
            }
            this.ErrorCode = errorCode;
            this.Parameter = _parameter;
            this.Details = details;
        }

        /// <summary>
        /// A human readable message that describes the error.
        /// </summary>
        /// <value>A human readable message that describes the error.</value>
        [DataMember(Name = "description", IsRequired = true, EmitDefaultValue = true)]
        public string Description { get; set; }

        /// <summary>
        /// A constant string that can be used to identify this error class programmatically. An errorCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified. Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.  **Error codes for** &#x60;GENERAL_VALIDATION_ERROR&#x60;  * &#x60;GENERAL_INVALID_VALUE&#x60; - A parameter is set to an invalid value.   * &#x60;value&#x60; - The invalid value. * &#x60;GENERAL_UNRECOGNIZED_PARAMETER&#x60; - A parameter is unknown. * &#x60;GENERAL_MISSING_PARAMETER&#x60; - A required parameter is missing. * &#x60;GENERAL_MINIMUM_LENGTH_VIOLATED&#x60; - The minimum length is violated.   * &#x60;minimumLength&#x60; - The minimum length (integer). * &#x60;GENERAL_MAXIMUM_LENGTH_VIOLATED&#x60; - The maximum length is violated.   * &#x60;maximumLength&#x60; - The maximum length (integer). * &#x60;GENERAL_MINIMUM_VALUE_VIOLATED&#x60; - The minimum value restriction is violated.   * &#x60;minimumValue&#x60; - The minimum value (integer or double). * &#x60;GENERAL_MAXIMUM_VALUE_VIOLATED&#x60; - The maximum value restriction is violated.   * &#x60;maximumValue&#x60; - The maximum value (integer or double). * &#x60;GENERAL_DUPLICATE_PARAMETER&#x60; - A parameter is duplicated. * &#x60;GENERAL_INVALID_LIST&#x60; - A list has an invalid format such as duplicate commas.   * &#x60;value&#x60; - The invalid list. * &#x60;MATRIX_ROUTING_PROFILE_NOT_FOUND&#x60; - The requested profile could not be found.   * &#x60;value&#x60; - The invalid profile. * &#x60;MATRIX_ROUTING_UNSUPPORTED_CURRENCY&#x60; - The specified currency is not supported.   * &#x60;value&#x60; - The unsupported currency. * &#x60;MATRIX_ROUTING_TOO_MANY_RELATIONS&#x60; - The request contains too many relations.   * &#x60;limit&#x60;- The maximum allowed number of relations for a single request. * &#x60;MATRIX_ROUTING_LOCATIONS_TOO_FAR_AWAY&#x60; - Locations are too far away from each other.   * &#x60;limit&#x60;- All locations have to be inside a rectangle with edges of at most 500 km length. * &#x60;MATRIX_ROUTING_UNSUPPORTED_RESULT_OPTION&#x60; - The specified result option is not supported.   * &#x60;value&#x60; - The unsupported result option. * &#x60;MATRIX_ROUTING_UNSUPPORTED_PLAIN_RESULT_FORMAT_WITH_TRAVEL_TIME_PROFILES&#x60; - The travel time profiles cannot be requested in combination with the result format PLAIN. * &#x60;MATRIX_ROUTING_UNSUPPORTED_OPTIONS_WITH_SYNC&#x60; - This option is not supported with synchronous call. * &#x60;MATRIX_ROUTING_TRAVEL_TIMES_MUST_BE_REQUESTED&#x60; - The results should contain TRAVEL_TIMES. * &#x60;MATRIX_ROUTING_PARAMETER_CONFLICT&#x60; - Two parameters are in conflict with each other.   * &#x60;conflictingParameter&#x60; - The conflicting parameter.   * &#x60;message&#x60; - The error message.
        /// </summary>
        /// <value>A constant string that can be used to identify this error class programmatically. An errorCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified. Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.  **Error codes for** &#x60;GENERAL_VALIDATION_ERROR&#x60;  * &#x60;GENERAL_INVALID_VALUE&#x60; - A parameter is set to an invalid value.   * &#x60;value&#x60; - The invalid value. * &#x60;GENERAL_UNRECOGNIZED_PARAMETER&#x60; - A parameter is unknown. * &#x60;GENERAL_MISSING_PARAMETER&#x60; - A required parameter is missing. * &#x60;GENERAL_MINIMUM_LENGTH_VIOLATED&#x60; - The minimum length is violated.   * &#x60;minimumLength&#x60; - The minimum length (integer). * &#x60;GENERAL_MAXIMUM_LENGTH_VIOLATED&#x60; - The maximum length is violated.   * &#x60;maximumLength&#x60; - The maximum length (integer). * &#x60;GENERAL_MINIMUM_VALUE_VIOLATED&#x60; - The minimum value restriction is violated.   * &#x60;minimumValue&#x60; - The minimum value (integer or double). * &#x60;GENERAL_MAXIMUM_VALUE_VIOLATED&#x60; - The maximum value restriction is violated.   * &#x60;maximumValue&#x60; - The maximum value (integer or double). * &#x60;GENERAL_DUPLICATE_PARAMETER&#x60; - A parameter is duplicated. * &#x60;GENERAL_INVALID_LIST&#x60; - A list has an invalid format such as duplicate commas.   * &#x60;value&#x60; - The invalid list. * &#x60;MATRIX_ROUTING_PROFILE_NOT_FOUND&#x60; - The requested profile could not be found.   * &#x60;value&#x60; - The invalid profile. * &#x60;MATRIX_ROUTING_UNSUPPORTED_CURRENCY&#x60; - The specified currency is not supported.   * &#x60;value&#x60; - The unsupported currency. * &#x60;MATRIX_ROUTING_TOO_MANY_RELATIONS&#x60; - The request contains too many relations.   * &#x60;limit&#x60;- The maximum allowed number of relations for a single request. * &#x60;MATRIX_ROUTING_LOCATIONS_TOO_FAR_AWAY&#x60; - Locations are too far away from each other.   * &#x60;limit&#x60;- All locations have to be inside a rectangle with edges of at most 500 km length. * &#x60;MATRIX_ROUTING_UNSUPPORTED_RESULT_OPTION&#x60; - The specified result option is not supported.   * &#x60;value&#x60; - The unsupported result option. * &#x60;MATRIX_ROUTING_UNSUPPORTED_PLAIN_RESULT_FORMAT_WITH_TRAVEL_TIME_PROFILES&#x60; - The travel time profiles cannot be requested in combination with the result format PLAIN. * &#x60;MATRIX_ROUTING_UNSUPPORTED_OPTIONS_WITH_SYNC&#x60; - This option is not supported with synchronous call. * &#x60;MATRIX_ROUTING_TRAVEL_TIMES_MUST_BE_REQUESTED&#x60; - The results should contain TRAVEL_TIMES. * &#x60;MATRIX_ROUTING_PARAMETER_CONFLICT&#x60; - Two parameters are in conflict with each other.   * &#x60;conflictingParameter&#x60; - The conflicting parameter.   * &#x60;message&#x60; - The error message.</value>
        [DataMember(Name = "errorCode", IsRequired = true, EmitDefaultValue = true)]
        public string ErrorCode { get; set; }

        /// <summary>
        /// The name of the affected query or path parameter or a JSONPath to the affected property of the request.
        /// </summary>
        /// <value>The name of the affected query or path parameter or a JSONPath to the affected property of the request.</value>
        [DataMember(Name = "parameter", EmitDefaultValue = false)]
        public string Parameter { get; set; }

        /// <summary>
        /// Additional properties specific to this error class.
        /// </summary>
        /// <value>Additional properties specific to this error class.</value>
        [DataMember(Name = "details", EmitDefaultValue = false)]
        public Dictionary<string, Object> Details { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CausingError {\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  ErrorCode: ").Append(ErrorCode).Append("\n");
            sb.Append("  Parameter: ").Append(Parameter).Append("\n");
            sb.Append("  Details: ").Append(Details).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as CausingError);
        }

        /// <summary>
        /// Returns true if CausingError instances are equal
        /// </summary>
        /// <param name="input">Instance of CausingError to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CausingError input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.ErrorCode == input.ErrorCode ||
                    (this.ErrorCode != null &&
                    this.ErrorCode.Equals(input.ErrorCode))
                ) && 
                (
                    this.Parameter == input.Parameter ||
                    (this.Parameter != null &&
                    this.Parameter.Equals(input.Parameter))
                ) && 
                (
                    this.Details == input.Details ||
                    this.Details != null &&
                    input.Details != null &&
                    this.Details.SequenceEqual(input.Details)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
                }
                if (this.ErrorCode != null)
                {
                    hashCode = (hashCode * 59) + this.ErrorCode.GetHashCode();
                }
                if (this.Parameter != null)
                {
                    hashCode = (hashCode * 59) + this.Parameter.GetHashCode();
                }
                if (this.Details != null)
                {
                    hashCode = (hashCode * 59) + this.Details.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
