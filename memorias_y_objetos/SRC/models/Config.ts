export default class Config {
private static instance: Config;
url: string;
port: number;

private constructor(url: string, port: number) {
    this.url = url;
    this.port = port;
}

static getInstance(url: string, port: number): Config {
    if (!Config.instance) {
    Config.instance = new Config(url, port);
    }
    return Config.instance;
}
}
