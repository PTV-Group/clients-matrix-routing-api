/* tslint:disable */
/* eslint-disable */
/**
 * Matrix Routing
 * With the Matrix Routing service you can compute distances and travel times between a set of origins and destinations.
 *
 * The version of the OpenAPI document: 1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import {
    Location,
    LocationFromJSON,
    LocationFromJSONTyped,
    LocationToJSON,
} from './';

/**
 * 
 * @export
 * @interface Locations
 */
export interface Locations {
    /**
     * The list of origins.
     * @type {Array<Location>}
     * @memberof Locations
     */
    origins: Array<Location>;
    /**
     * The list of destinations. If this list is empty, the destinations are equal to the origins.
     * @type {Array<Location>}
     * @memberof Locations
     */
    destinations?: Array<Location>;
}

export function LocationsFromJSON(json: any): Locations {
    return LocationsFromJSONTyped(json, false);
}

export function LocationsFromJSONTyped(json: any, ignoreDiscriminator: boolean): Locations {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'origins': ((json['origins'] as Array<any>).map(LocationFromJSON)),
        'destinations': !exists(json, 'destinations') ? undefined : ((json['destinations'] as Array<any>).map(LocationFromJSON)),
    };
}

export function LocationsToJSON(value?: Locations | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'origins': ((value.origins as Array<any>).map(LocationToJSON)),
        'destinations': value.destinations === undefined ? undefined : ((value.destinations as Array<any>).map(LocationToJSON)),
    };
}


