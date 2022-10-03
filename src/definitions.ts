export interface HealthConnectPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
