/* tslint:disable */
/* eslint-disable */
/**
 * Matrix Routing API
 * With the Matrix Routing service you can compute distances and travel times between a set of origins and destinations.
 *
 * The version of the OpenAPI document: 1.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
 * The current status of the calculation.
 *  * `RUNNING` - The calculation is still running.
 *  * `SUCCEEDED` - The calculation has completed successfully.
 *  * `FAILED` - The calculation has completed with a failure.
 * @export
 * @enum {string}
 */
export enum CalculationStatus {
    RUNNING = 'RUNNING',
    SUCCEEDED = 'SUCCEEDED',
    FAILED = 'FAILED'
}

export function CalculationStatusFromJSON(json: any): CalculationStatus {
    return CalculationStatusFromJSONTyped(json, false);
}

export function CalculationStatusFromJSONTyped(json: any, ignoreDiscriminator: boolean): CalculationStatus {
    return json as CalculationStatus;
}

export function CalculationStatusToJSON(value?: CalculationStatus | null): any {
    return value as any;
}

