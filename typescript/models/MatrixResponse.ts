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

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface MatrixResponse
 */
export interface MatrixResponse {
    /**
     * Percentage of relations in the distance matrix which has not been calculated successfully. 
     * @type {number}
     * @memberof MatrixResponse
     */
    percentageOfDirectDistanceRelations?: number;
    /**
     * The distances of the requested matrix elements [m]. To access to the distance of the relation between the origin i and the destination j, read the k-th element defined by `k = i * N + j`, with N being the number of destinations.
     * @type {Array<number>}
     * @memberof MatrixResponse
     */
    distances?: Array<number>;
    /**
     * The travel times of the requested matrix elements [s]. To access to the travel time of the relation between the origin i and the destination j, read the k-th element defined by `k = i * N + j`, with N being the number of destinations.
     * @type {Array<number>}
     * @memberof MatrixResponse
     */
    travelTimes?: Array<number>;
    /**
     * The toll costs of the requested matrix elements in the requested currency. To access to the toll cost of the relation between the origin i and the destination j, read the k-th element defined by `k = i * N + j`, with N being the number of destinations.  
     * Toll prices do not include VAT.
     * @type {Array<number>}
     * @memberof MatrixResponse
     */
    tollCosts?: Array<number>;
}

export function MatrixResponseFromJSON(json: any): MatrixResponse {
    return MatrixResponseFromJSONTyped(json, false);
}

export function MatrixResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): MatrixResponse {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'percentageOfDirectDistanceRelations': !exists(json, 'percentageOfDirectDistanceRelations') ? undefined : json['percentageOfDirectDistanceRelations'],
        'distances': !exists(json, 'distances') ? undefined : json['distances'],
        'travelTimes': !exists(json, 'travelTimes') ? undefined : json['travelTimes'],
        'tollCosts': !exists(json, 'tollCosts') ? undefined : json['tollCosts'],
    };
}

export function MatrixResponseToJSON(value?: MatrixResponse | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'percentageOfDirectDistanceRelations': value.percentageOfDirectDistanceRelations,
        'distances': value.distances,
        'travelTimes': value.travelTimes,
        'tollCosts': value.tollCosts,
    };
}

