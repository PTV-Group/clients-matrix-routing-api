/* tslint:disable */
/* eslint-disable */
/**
 * Matrix Routing
 * With the Matrix Routing service you can compute distances and travel times between a set of origins and destinations.
 *
 * The version of the OpenAPI document: 1.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * Defines how to consider traffic in a matrix calculation.
 * * `AVERAGE` - Use the average **travelTime** for the selected vehicle.
 *  If **startTime** is specified, the typical traffic situation for that time of day and day of week will be considered such as the rushhour
 *  on Monday morning or light traffic on Saturday evening. Toll will be calculated according to that date and time.
 * * `REALISTIC` - Use the most realistic **travelTime** for the selected vehicle and the
 *  given **startTime**.
 *  Takes into account the live traffic situation such as traffic jams or road works
 *  as well as the typical traffic situation at the time of day and the day of week of travel such as the rushhour
 *  on Monday morning or light traffic on Saturday evening.
 *  See [here](./concepts/time-dependent-matrix) for more information.
 * **Only available for startMatrixCalculation operation.**
 * @export
 */
export const TrafficMode = {
    AVERAGE: 'AVERAGE',
    REALISTIC: 'REALISTIC'
} as const;
export type TrafficMode = typeof TrafficMode[keyof typeof TrafficMode];


export function instanceOfTrafficMode(value: any): boolean {
    for (const key in TrafficMode) {
        if (Object.prototype.hasOwnProperty.call(TrafficMode, key)) {
            if (TrafficMode[key as keyof typeof TrafficMode] === value) {
                return true;
            }
        }
    }
    return false;
}

export function TrafficModeFromJSON(json: any): TrafficMode {
    return TrafficModeFromJSONTyped(json, false);
}

export function TrafficModeFromJSONTyped(json: any, ignoreDiscriminator: boolean): TrafficMode {
    return json as TrafficMode;
}

export function TrafficModeToJSON(value?: TrafficMode | null): any {
    return value as any;
}

