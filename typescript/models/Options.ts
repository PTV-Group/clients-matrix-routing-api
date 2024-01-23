/* tslint:disable */
/* eslint-disable */
/**
 * Matrix Routing
 * With the Matrix Routing service you can compute distances and travel times between a set of origins and destinations.
 *
 * The version of the OpenAPI document: 1.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import type { ResultFormat } from './ResultFormat';
import {
    ResultFormatFromJSON,
    ResultFormatFromJSONTyped,
    ResultFormatToJSON,
} from './ResultFormat';
import type { TrafficMode } from './TrafficMode';
import {
    TrafficModeFromJSON,
    TrafficModeFromJSONTyped,
    TrafficModeToJSON,
} from './TrafficMode';

/**
 * 
 * @export
 * @interface Options
 */
export interface Options {
    /**
     * Currency to which the toll prices should be converted to. Use the currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     * If it is not specified, the currency is taken from the **profile**.
     * @type {string}
     * @memberof Options
     */
    currency?: string | null;
    /**
     * Defines the start time of each route, formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * This field is mutually exclusive with **tollTime**.
     * If not specified, the routes are calculated using the average speed of each road.
     * If the date-time string does not include an explicit offset to UTC, the position of the **origins** are used to find the missing offset. If multiple offsets are detected then an error is returned and the distance matrix calculation is aborted totally.        
     * The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00. 
     * If **duration** is also specified, the travel time profiles will be calculated using the horizon defined with **startTime** and **duration**
     * See [here](./concepts/time-dependent-matrix) for more information on the relevance of date and time.
     * @type {Date}
     * @memberof Options
     */
    startTime?: Date | null;
    /**
     * Defines the date and time at which to calculate toll prices formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * This parameter only has an influence if toll related results are requested. It can only be used in combination with **trafficMode** _AVERAGE_ 
     * and it is mutually exclusive with **startTime**.
     * If the date-time string does not include an explicit offset to UTC, the position of the **origins** are used to find the missing offset. If multiple offsets are detected then an error is returned and the distance matrix calculation is aborted totally.        
     * The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.  
     * See [here](./concepts/toll-matrix-calculation) for more information on the relevance of date and time.
     * @type {Date}
     * @memberof Options
     */
    tollTime?: Date | null;
    /**
     * Defines the duration [s] for the calculation of travel time profiles.
     * This field is ignored if **startTime** is not set.
     * @type {number}
     * @memberof Options
     */
    duration?: number;
    /**
     * 
     * @type {TrafficMode}
     * @memberof Options
     */
    trafficMode?: TrafficMode;
    /**
     * 
     * @type {ResultFormat}
     * @memberof Options
     */
    resultFormat?: ResultFormat;
}

/**
 * Check if a given object implements the Options interface.
 */
export function instanceOfOptions(value: object): boolean {
    let isInstance = true;

    return isInstance;
}

export function OptionsFromJSON(json: any): Options {
    return OptionsFromJSONTyped(json, false);
}

export function OptionsFromJSONTyped(json: any, ignoreDiscriminator: boolean): Options {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'currency': !exists(json, 'currency') ? undefined : json['currency'],
        'startTime': !exists(json, 'startTime') ? undefined : (json['startTime'] === null ? null : new Date(json['startTime'])),
        'tollTime': !exists(json, 'tollTime') ? undefined : (json['tollTime'] === null ? null : new Date(json['tollTime'])),
        'duration': !exists(json, 'duration') ? undefined : json['duration'],
        'trafficMode': !exists(json, 'trafficMode') ? undefined : TrafficModeFromJSON(json['trafficMode']),
        'resultFormat': !exists(json, 'resultFormat') ? undefined : ResultFormatFromJSON(json['resultFormat']),
    };
}

export function OptionsToJSON(value?: Options | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'currency': value.currency,
        'startTime': value.startTime === undefined ? undefined : (value.startTime === null ? null : value.startTime.toISOString()),
        'tollTime': value.tollTime === undefined ? undefined : (value.tollTime === null ? null : value.tollTime.toISOString()),
        'duration': value.duration,
        'trafficMode': TrafficModeToJSON(value.trafficMode),
        'resultFormat': ResultFormatToJSON(value.resultFormat),
    };
}

