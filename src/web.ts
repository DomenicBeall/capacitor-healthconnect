import { WebPlugin } from '@capacitor/core';

import type { HealthConnectPlugin } from './definitions';

export class HealthConnectWeb extends WebPlugin implements HealthConnectPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
