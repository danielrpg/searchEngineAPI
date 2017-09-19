import { SearchEngineCliPage } from './app.po';

describe('search-engine-cli App', () => {
  let page: SearchEngineCliPage;

  beforeEach(() => {
    page = new SearchEngineCliPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});
