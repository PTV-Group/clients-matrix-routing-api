/* tslint:disable */
/* eslint-disable */
/**
 * Matrix Routing
 * With the Matrix Routing service you can compute distances and travel times between a set of origins and destinations.
 *
 * The version of the OpenAPI document: 1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { Warning } from './Warning';
import {
    WarningFromJSON,
    WarningFromJSONTyped,
    WarningToJSON,
} from './Warning';

/**
 * 
 * @export
 * @interface MatrixResponse
 */
export interface MatrixResponse {
    /**
     * Percentage of relations in the distance matrix which has not been calculated successfully. 
     * Zero distances corresponding to A-A relations are not included in this calculation.
     * @type {number}
     * @memberof MatrixResponse
     */
    percentageOfDirectDistanceRelations?: number;
    /**
     * The distances of the requested matrix elements [m]. To access to the distance of the relation between the origin i and the destination j, read the k-th element defined by `k = i * N + j`, with N being the number of destinations.
     * Please note that the distance for an A-A relation is always set to zero.
     * @type {Array<number>}
     * @memberof MatrixResponse
     */
    distances?: Array<number>;
    /**
     * The distances of the requested matrix elements [m]. Each value is expressed as unsigned integer and uses a 4-bytes little endian scheme. See [here](./concepts/results-representation) for more information.
     * To access to the distance of the relation between the origin i and the destination j, read the k-th element defined by `k = i * N + j`, with N being the number of destinations.
     * Please note that the distance for an A-A relation is always set to zero.
     * @type {string}
     * @memberof MatrixResponse
     */
    distancesEncoded?: string;
    /**
     * The travel times of the requested matrix elements [s]. To access to the travel time of the relation between the origin i and the destination j, read the k-th element defined by `k = i * N + j`, with N being the number of destinations.
     * Please note that the travel time for an A-A relation is always set to zero.
     * @type {Array<number>}
     * @memberof MatrixResponse
     */
    travelTimes?: Array<number>;
    /**
     * The travel times of the requested matrix elements [s]. Each value is expressed as unsigned integer and uses a 4-bytes little endian scheme. See [here](./concepts/results-representation) for more information.
     * To access to the travel time of the relation between the origin i and the destination j, read the k-th element defined by `k = i * N + j`, with N being the number of destinations.
     * Please note that the travel time for an A-A relation is always set to zero.
     * @type {string}
     * @memberof MatrixResponse
     */
    travelTimesEncoded?: string;
    /**
     * The travel time profiles of the requested matrix elements. Each profile is expressed using a encoded format which is explained [here](./concepts/results-representation). 
     * Please note that the travel time for an A-A relation is always set to zero.
     * @type {string}
     * @memberof MatrixResponse
     */
    travelTimeProfilesEncoded?: string;
    /**
     * The toll costs of the requested matrix elements in the requested currency. To access to the toll cost of the relation between the origin i and the destination j, read the k-th element defined by `k = i * N + j`, with N being the number of destinations.  
     * Toll prices do not include VAT.
     * 
     * @type {Array<number>}
     * @memberof MatrixResponse
     */
    tollCosts?: Array<number>;
    /**
     * The toll costs of the requested matrix elements in the requested currency. Each value is expressed as unsigned integer and uses a 4-bytes little endian scheme. See [here](./concepts/results-representation) for more information.
     * To access to the toll cost of the relation between the origin i and the destination j, read the k-th element defined by `k = i * N + j`, with N being the number of destinations.
     * Please note that the travel time for an A-A relation is always set to zero.
     * @type {string}
     * @memberof MatrixResponse
     */
    tollCostsEncoded?: string;
    /**
     * The directDistance flags of the requested matrix elements. To access to the directDistance flag of the relation between the origin i and the destination j, read the k-th element defined by `k = i * N + j`, with N being the number of destinations.
     * Please note that the directDistance flag for an A-A relation is always set to false.
     * @type {Array<boolean>}
     * @memberof MatrixResponse
     */
    directDistanceFlags?: Array<boolean>;
    /**
     * The directDistance flags of the requested matrix elements. The directDistance flags are returned as contiguous arrays of bytes. See [here](./concepts/results-representation) for more information.
     * To access to the directDistance flag of the relation between the origin i and the destination j, read the k-th element defined by `k = (i * N + j) / 8`, with N being the number of destinations.
     * And then, read the l-th bit defined by `l = (i * N + j) % 8`.
     * Please note that the directDistance flag for an A-A relation is always set to false.
     * @type {string}
     * @memberof MatrixResponse
     */
    directDistanceFlagsEncoded?: string;
    /**
     * The violation flags of the requested matrix elements. To access to the violation flag of the relation between the origin i and the destination j, read the k-th element defined by `k = i * N + j`, with N being the number of destinations.
     * Please note that the violation flag for an A-A relation is always set to false.
     * @type {Array<boolean>}
     * @memberof MatrixResponse
     */
    violationFlags?: Array<boolean>;
    /**
     * The violation flags of the requested matrix elements. The violated flags are returned as contiguous arrays of bytes. See [here](./concepts/results-representation) for more information.
     * To access to the violation flag of the relation between the origin i and the destination j, read the k-th element defined by `k = (i * N + j) / 8`, with N being the number of destinations.
     * And then, read the l-th bit defined by `l = (i * N + j) % 8`.
     * Please note that the violation flag for an A-A relation is always set to false.
     * @type {string}
     * @memberof MatrixResponse
     */
    violationFlagsEncoded?: string;
    /**
     * A list of warnings concerning the validity of the result.
     * @type {Array<Warning>}
     * @memberof MatrixResponse
     */
    warnings?: Array<Warning>;
}

/**
 * Check if a given object implements the MatrixResponse interface.
 */
export function instanceOfMatrixResponse(value: object): value is MatrixResponse {
    return true;
}

export function MatrixResponseFromJSON(json: any): MatrixResponse {
    return MatrixResponseFromJSONTyped(json, false);
}

export function MatrixResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): MatrixResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'percentageOfDirectDistanceRelations': json['percentageOfDirectDistanceRelations'] == null ? undefined : json['percentageOfDirectDistanceRelations'],
        'distances': json['distances'] == null ? undefined : json['distances'],
        'distancesEncoded': json['distancesEncoded'] == null ? undefined : json['distancesEncoded'],
        'travelTimes': json['travelTimes'] == null ? undefined : json['travelTimes'],
        'travelTimesEncoded': json['travelTimesEncoded'] == null ? undefined : json['travelTimesEncoded'],
        'travelTimeProfilesEncoded': json['travelTimeProfilesEncoded'] == null ? undefined : json['travelTimeProfilesEncoded'],
        'tollCosts': json['tollCosts'] == null ? undefined : json['tollCosts'],
        'tollCostsEncoded': json['tollCostsEncoded'] == null ? undefined : json['tollCostsEncoded'],
        'directDistanceFlags': json['directDistanceFlags'] == null ? undefined : json['directDistanceFlags'],
        'directDistanceFlagsEncoded': json['directDistanceFlagsEncoded'] == null ? undefined : json['directDistanceFlagsEncoded'],
        'violationFlags': json['violationFlags'] == null ? undefined : json['violationFlags'],
        'violationFlagsEncoded': json['violationFlagsEncoded'] == null ? undefined : json['violationFlagsEncoded'],
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(WarningFromJSON)),
    };
}

export function MatrixResponseToJSON(value?: MatrixResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'percentageOfDirectDistanceRelations': value['percentageOfDirectDistanceRelations'],
        'distances': value['distances'],
        'distancesEncoded': value['distancesEncoded'],
        'travelTimes': value['travelTimes'],
        'travelTimesEncoded': value['travelTimesEncoded'],
        'travelTimeProfilesEncoded': value['travelTimeProfilesEncoded'],
        'tollCosts': value['tollCosts'],
        'tollCostsEncoded': value['tollCostsEncoded'],
        'directDistanceFlags': value['directDistanceFlags'],
        'directDistanceFlagsEncoded': value['directDistanceFlagsEncoded'],
        'violationFlags': value['violationFlags'],
        'violationFlagsEncoded': value['violationFlagsEncoded'],
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(WarningToJSON)),
    };
}

