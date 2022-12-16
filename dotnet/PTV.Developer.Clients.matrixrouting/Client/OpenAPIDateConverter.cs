/*
 * Matrix Routing API
 *
 * With the Matrix Routing service you can compute distances and travel times between a set of origins and destinations.
 *
 * The version of the OpenAPI document: 1.2
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using Newtonsoft.Json.Converters;

namespace PTV.Developer.Clients.matrixrouting.Client
{
    /// <summary>
    /// Formatter for 'date' openapi formats ss defined by full-date - RFC3339
    /// see https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.0.md#data-types
    /// </summary>
    public class OpenAPIDateConverter : IsoDateTimeConverter
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OpenAPIDateConverter" /> class.
        /// </summary>
        public OpenAPIDateConverter()
        {
            // full-date   = date-fullyear "-" date-month "-" date-mday
            DateTimeFormat = "yyyy-MM-dd";
        }
    }
}